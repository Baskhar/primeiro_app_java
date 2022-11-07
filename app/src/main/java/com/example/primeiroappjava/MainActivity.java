package com.example.primeiroappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campo1;//importando a classe edit text para linkar com o editor de TEXTO na tela
    private Button botao1; //importando a classe edit text para linkar com o editor de BOTÃO na tela

    @Override
    protected void onCreate(Bundle savedInstanceState) {//método de configuração
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = findViewById(R.id.nome);//instanciando o meu campo 1 com o id do nome
        botao1 = findViewById(R.id.botao);//instanciando o meu botao 1 com o id do botao
        //Função que irá configurar o click do botão
        botao1.setOnClickListener(new View.OnClickListener() {//instanciando a interface(método abstrato on click
            @Override
            public void onClick(View view) {
                String textodigitado = campo1.getText().toString();//passando o conteudo do campo para a variavel
                Toast.makeText(MainActivity.this, textodigitado, Toast.LENGTH_SHORT).show();//exibir o texto na tela(Toast: Tempo que a mensagem será exibida/ show= mostra a mensagem)
            }
        });
    }
}