package com.erick.guia_gastronimoca_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private EditText email;
    private EditText password;
    private Button registrar;
    private Button entrar;

    //declaramos un objeto firebaseAuth
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.edtPassword);
        registrar = findViewById(R.id.btnRegistro);
        entrar = findViewById(R.id.btnEntrar);

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);

        registrar.setOnClickListener(this);
        entrar.setOnClickListener(this);

    }
    private  void registrarUsuario(){
        String em = email.getText().toString().trim();
        String pa = password.getText().toString().trim();

        if (TextUtils.isEmpty(em)){
            Toast.makeText(this,"ingrese un email", Toast.LENGTH_LONG).show();
            return;
        }else if (TextUtils.isEmpty(pa)){
            Toast.makeText(this,"ingrese una contraseña", Toast.LENGTH_LONG).show();
            return;
        }
        progressDialog.setMessage("registrando...");
        progressDialog.show();

        //registramos un nuevo usuario

        firebaseAuth.createUserWithEmailAndPassword(em,pa).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Login.this,"registrado usuario: "+ email.getText(),Toast.LENGTH_LONG).show();
                    email.getText().clear();
                    password.getText().clear();
                }
                    if(task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(Login.this,"ya existe este usuario",Toast.LENGTH_LONG).show();
                    }

                progressDialog.dismiss();
            }
        });

    }

    private void loginUsuario(){
        String em = email.getText().toString().trim();
        String pa = password.getText().toString().trim();

        if (TextUtils.isEmpty(em)){
            Toast.makeText(this,"ingrese un email", Toast.LENGTH_LONG).show();
            return;
        }else if (TextUtils.isEmpty(pa)){
            Toast.makeText(this,"por favor ingrese una contraseña", Toast.LENGTH_LONG).show();
            return;
        }
        progressDialog.setMessage("ingresando...");
        progressDialog.show();

        //ingreso de cesion usuario

        firebaseAuth.signInWithEmailAndPassword(em,pa).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Login.this,"GUIA GASTRONIMICA AMERICA DEL SUR",Toast.LENGTH_LONG).show();
                    Intent pais = new Intent(getApplication(),Paises.class);
                    startActivity(pais);
                }else{
                    Toast.makeText(Login.this,"usuario y/o contraseña incorrecto",Toast.LENGTH_LONG).show();
                }

                progressDialog.dismiss();
            }
        });
    }

    @Override
    public void onClick(View v) {
      switch (v.getId()){
          case R.id.btnRegistro:
              registrarUsuario();
              break;
          case R.id.btnEntrar:
              loginUsuario();
              break;

         }
      }



}