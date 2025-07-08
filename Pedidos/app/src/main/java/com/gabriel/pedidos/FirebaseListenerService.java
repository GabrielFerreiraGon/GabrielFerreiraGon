package com.gabriel.pedidos;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class FirebaseListenerService extends Service {
    private DatabaseReference dbRef;
    private ChildEventListener childEventListener;

    @Override
    public void onCreate() {
        super.onCreate();
        iniciarListener();
    }

    public void iniciarListener() {
        dbRef = FirebaseDatabase.getInstance().getReference()
                .child("solicitações").child("peças").child("turnodamanha").child("solicitações_de_peças");

        childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, String previousChildName) {
                Log.d("Firebase", "Novo item ");
                enviarNotificacao("Nova Solicitação");
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, String previousChildName) {
                String pedidoAtualizado = snapshot.getKey();
                enviarNotificacao("Pedido atualizado: " + pedidoAtualizado);
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {
                Log.d("Firebase", "Item deletado");
                enviarNotificacao("Item deletado");
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, String previousChildName) {
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        };

        dbRef.addChildEventListener(childEventListener);
    }

    @SuppressLint("ForegroundServiceType")
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startForeground(1, criarNotificacaoInicial()); // Garante que o serviço não será encerrado
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (dbRef != null && childEventListener != null) {
            dbRef.removeEventListener(childEventListener);
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void enviarNotificacao(String titulo) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel canal = new NotificationChannel("MeuCanal", "Notificações", NotificationManager.IMPORTANCE_HIGH);
            notificationManager.createNotificationChannel(canal);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "MeuCanal")
                .setSmallIcon(android.R.drawable.sym_action_email)
                .setContentTitle(titulo)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true);

        int notificationId = new Random().nextInt();
        notificationManager.notify(notificationId, builder.build());
    }

    private Notification criarNotificacaoInicial() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "MeuCanal")
                .setSmallIcon(android.R.drawable.presence_online)
                .setContentTitle("Serviço em execução")
                .setContentText("Monitorando solicitações do Firebase...")
                .setPriority(NotificationCompat.PRIORITY_MIN)
                .setAutoCancel(false);

        return builder.build();
    }
}