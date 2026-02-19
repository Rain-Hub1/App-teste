package com.exemplo.meuapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Carrega o código C++ compilado
    static {
        System.loadLibrary("meuapp");
    }

    // Declara a função que está no C++
    public native String mensagemDoCpp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = findViewById(R.id.texto);
        Button botao = findViewById(R.id.botao);

        // Quando clicar no botão, chama o C++ e mostra o texto
        botao.setOnClickListener(v -> {
            String mensagem = mensagemDoCpp();
            texto.setText(mensagem);
        });
    }
}
