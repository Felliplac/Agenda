package com.lacolli.agenda;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        Button botaosalvar = (Button) findViewById(R.id.formularioSalvarButton);
        botaosalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FormularioActivity.this, "Vai Corinthians", Toast.LENGTH_LONG).show();
            }
        });

    }
}