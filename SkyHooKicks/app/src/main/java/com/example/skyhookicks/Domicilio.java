package com.example.skyhookicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Domicilio extends AppCompatActivity {

    Button Pedido;
    ImageButton casita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domicilio);

        casita = (ImageButton) findViewById(R.id.casita);
        Pedido = (Button) findViewById(R.id.pedido);

        casita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Domicilio.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        Pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pedido realizado con exito.");
                Intent i = new Intent(Domicilio.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }


}