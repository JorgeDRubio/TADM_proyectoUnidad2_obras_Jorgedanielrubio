package com.example.jorge.tadm_proyectounidad2_obras_jorgedanielrubio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    Button btnObras, btnTrabajadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        fnStrartingButtons();
        btnTrabajadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goWorkers = new Intent(getApplicationContext(),Workers.class);
                startActivity(goWorkers);
            }
        });

        btnObras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBuildings = new Intent(getApplicationContext(),Buildings.class);
                startActivity(goBuildings);
            }
        });

    }

    void fnStrartingButtons(){
        btnObras = findViewById(R.id.btnObras);
        btnTrabajadores = findViewById(R.id.btnTrabajadores);
    }
}
