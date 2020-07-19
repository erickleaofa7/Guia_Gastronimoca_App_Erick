package com.erick.guia_gastronimoca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Paises extends AppCompatActivity implements View.OnClickListener {
    ImageButton ecuador,peru,colombia,chile,venezuela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises2);

        ecuador = findViewById(R.id.btnEcuador);
        ecuador.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEcuador:
                Intent ec = new Intent(this,TabPaises.class);
                startActivity(ec);
                Toast.makeText(getApplicationContext(),"BIENVENIDOS A ECUADOR",Toast.LENGTH_LONG).show();
                break;
        }
    }
}