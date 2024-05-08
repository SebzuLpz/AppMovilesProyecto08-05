package com.example.skyhookicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Recoger extends AppCompatActivity {


    ImageButton casita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recoger);


        casita = (ImageButton) findViewById(R.id.casita);

        casita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Recoger.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }


}