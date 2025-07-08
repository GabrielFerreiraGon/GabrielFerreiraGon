package com.gabriel.pedidos;


import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.HashMap;
import java.util.Map;

public class Settings {

    public void AddPedidos(String pn, int quantidade, String niveldeUrgencia){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference()
                .child("solicitações")
                .child("peças")
                .child("turnodamanha")
                .child("solicitações_de_peças");
        Map<String, Object> novoItem = new HashMap<>();
        String sanitizedPn = pn.replaceAll("[./#$\\[\\]]", "_");
        novoItem.put("Part number", sanitizedPn);
        novoItem.put("Quantidade", quantidade);
        novoItem.put("Urgência",niveldeUrgencia);
        // Gera um ID único automaticamente
        reference.push().setValue(novoItem)
                .addOnSuccessListener(aVoid -> Log.d("Firebase", "Item adicionado com sucesso!"))
                .addOnFailureListener(e -> Log.e("Firebase", "Erro ao adicionar item: " + e.getMessage()));

    }
    public void Conectar(){
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        Log.w("FCM", "Falha ao obter token", task.getException());
                        return;
                    }
                    String token = task.getResult();
                    Log.d("FCM", "Token: " + token);
                });

        FirebaseMessaging.getInstance().subscribeToTopic("todos")
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Log.d("FCM", "Inscrito no tópico global!");
                    } else {
                        Log.e("FCM", "Falha na inscrição ao tópico!");
                    }
                });
    }
}
