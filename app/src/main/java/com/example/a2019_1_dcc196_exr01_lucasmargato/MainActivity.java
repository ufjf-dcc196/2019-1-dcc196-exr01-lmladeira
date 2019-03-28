package com.example.a2019_1_dcc196_exr01_lucasmargato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText nome, sobrenome;
    Button confirma;
    TextView completo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.nome_usuario);
        sobrenome = (EditText) findViewById(R.id.sobrenome_usuario);
        confirma = (Button) findViewById(R.id.botao_nome);
        completo = (TextView) findViewById(R.id.nome_completo);

        confirma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                completo.setText(nome.getText() + " " + sobrenome.getText());
            }
        });
    }
}
