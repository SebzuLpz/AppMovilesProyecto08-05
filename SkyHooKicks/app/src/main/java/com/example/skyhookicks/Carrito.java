package com.example.skyhookicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Carrito extends AppCompatActivity {

    ImageButton casita;
    Button recogida;
    Button domicilio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);


        casita = (ImageButton) findViewById(R.id.casita);
        recogida = (Button) findViewById(R.id.recogida);
        domicilio = (Button) findViewById(R.id.domicilio);

        casita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Carrito.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        recogida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Carrito.this, Recoger.class);
                startActivity(i);
                finish();
            }
        });
        domicilio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Carrito.this, Domicilio.class);
                startActivity(i);
                finish();
            }
        });
    }


}
