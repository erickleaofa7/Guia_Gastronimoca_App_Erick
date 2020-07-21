package com.erick.guia_gastronimoca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.erick.guia_gastronimoca_app.Peru.Tab_Peru;

public class Paises extends AppCompatActivity implements View.OnClickListener {
    ImageButton ecuador,peru,colombia,chile,venezuela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises2);

        ecuador = findViewById(R.id.btnEcuador);
        ecuador.setOnClickListener(this);
        peru = findViewById(R.id.btnPeru);
        peru.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEcuador:
                Intent ec = new Intent(this,TabPaises.class);
                startActivity(ec);
                Toast.makeText(getApplicationContext(),"BIENVENIDO A ECUADOR",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnPeru:
                Intent pe = new Intent(this, Tab_Peru.class);
                startActivity(pe);
                Toast.makeText(getApplicationContext(),"BIENVENIDO A PERU",Toast.LENGTH_LONG).show();
                break;
        }
    }
}