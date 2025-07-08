package com.gabriel.pedidos;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;

import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class Entradas {
    String NiveldeUrgencia;
    Settings config = new Settings();
    public void exibirMensagem(Context context, String mensagem) {
        Toast.makeText(context, mensagem, Toast.LENGTH_SHORT).show();
    }

        @SuppressLint("UseSwitchCompatOrMaterialCode")
        public void inicializarComponentes(Activity activity) {
            AutoCompleteTextView autoCompleteTextView = activity.findViewById(R.id.choicePn);
            // Obtendo a lista do XML corretamente
            String[] listaPn = autoCompleteTextView.getContext().getResources().getStringArray(R.array.lista_pn);

            // Criando o adapter e associando ao AutoCompleteTextView
            ArrayAdapter<String> adapter = new ArrayAdapter<>(autoCompleteTextView.getContext(),
                    android.R.layout.simple_dropdown_item_1line, listaPn);
            autoCompleteTextView.setAdapter(adapter);
            autoCompleteTextView.setThreshold(1);
            //----------------------------------------------------------------
            TextView txtQuantidade;
            txtQuantidade = activity.findViewById(R.id.txtQuantidade);
            final Button[] btnDiminuir = {activity.findViewById(R.id.btnDiminuir)};
            Button btnAumentar = activity.findViewById(R.id.btnAumentar);

            final int[] quantidade = {1};
            btnAumentar.setOnClickListener(v -> {
                quantidade[0]++;
                txtQuantidade.setText(String.valueOf(quantidade[0]));
            });

            btnDiminuir[0].setOnClickListener(v -> {
                if (quantidade[0] > 1) {
                    quantidade[0]--;
                    txtQuantidade.setText(String.valueOf(quantidade[0]));
                }
            });
            //------------------------------------------------------------------
            Switch urgencia;
            urgencia = activity.findViewById(R.id.urgencia);
            urgencia.setOnCheckedChangeListener((buttonView, isChecked) -> {
                NiveldeUrgencia = isChecked ? "SIM" : "NÃO";
            });

            Button btnEnviar;
            btnEnviar = activity.findViewById(R.id.btnEnviar);
            btnEnviar.setOnClickListener(v -> {
                int num = quantidade[0];
                try {
                    config.AddPedidos(autoCompleteTextView.getText().toString().trim(), num ,NiveldeUrgencia);
                } catch (Exception e) {
                    Log.e("Erro", "Erro ao adicionar pedido: " + e.getMessage());
                    Toast.makeText(activity, "Erro ao processar pedido", Toast.LENGTH_SHORT).show();
                }

            });
            //-------------------------------------------------------------------

        }


    }

