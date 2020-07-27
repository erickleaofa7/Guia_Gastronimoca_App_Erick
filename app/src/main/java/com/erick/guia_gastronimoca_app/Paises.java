package com.erick.guia_gastronimoca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Paises extends AppCompatActivity implements View.OnClickListener {
    ImageButton ecuador,peru,colombia,chile,venezuela;
    EditText usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises2);

        ecuador = findViewById(R.id.btnEcuador);
        ecuador.setOnClickListener(this);
        peru = findViewById(R.id.btnPeru);
        peru.setOnClickListener(this);
        colombia = findViewById(R.id.btnColombia);
        colombia.setOnClickListener(this);
        venezuela = findViewById(R.id.btnVenezuela);
        venezuela.setOnClickListener(this);

        //usuario conectado facebook
        usuario = findViewById(R.id.edtUsuario);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null){
            String name = user.getDisplayName();
            usuario.setText(name);
        }

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
                Intent pe = new Intent(this,TabPeru.class);
                startActivity(pe);
                Toast.makeText(getApplicationContext(),"BIENVENIDO A PERU",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnColombia:
                Intent co = new Intent(this,Tab_Colombia.class);
                startActivity(co);
                Toast.makeText(getApplicationContext(),"BIENVENIDO A COLOMBIA",Toast.LENGTH_LONG).show();
            case R.id.btnVenezuela:
                Intent ve = new Intent(this,Tab_Venezuela.class);
                startActivity(ve);
                Toast.makeText(getApplicationContext(),"BIENVENIDO A VENEZUELA",Toast.LENGTH_LONG).show();



        }
    }

    //cerrar sesion facebook


    public void ActividaLogin(){
        Intent log = new Intent(Paises.this.getApplicationContext(),Login.class);
        log.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(log);
    }
    public  void sesion(View view){
        FirebaseAuth.getInstance().signOut();
        LoginManager.getInstance().logOut();
        ActividaLogin();
    }


}