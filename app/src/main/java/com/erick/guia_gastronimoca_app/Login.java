package com.erick.guia_gastronimoca_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private EditText email;
    private EditText password;
    private Button registrar;
    private Button entrar;


    // facebook
    CallbackManager callbackManager;
   LoginButton loginButton;

    //facebook


    //declaramos un objeto firebaseAuth
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;
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

        //facebbok

        callbackManager = CallbackManager.Factory.create();
        loginButton = findViewById(R.id.login_button);
        loginButton.setReadPermissions(Arrays.asList("email"));
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                handleFacebookAccesToken(loginResult.getAccessToken());
                inicioFace();
            }

            @Override
            public void onCancel() {
             Toast.makeText(getApplicationContext(),"se cancelo la operacion", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(getApplicationContext(),"error al ingresar", Toast.LENGTH_LONG).show();
            }
        });
         firebaseAuth = FirebaseAuth.getInstance();
         firebaseAuthListener = new FirebaseAuth.AuthStateListener() {
             @Override
             public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                 FirebaseUser user = firebaseAuth.getCurrentUser();
                 if (user!=null){
                     inicioFace();
                 }
             }
         };

    }

    private  void handleFacebookAccesToken(AccessToken accessToken){
        AuthCredential credential = FacebookAuthProvider.getCredential(accessToken.getToken());
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (!task.isSuccessful()){

                }
            }
        });
    }

    //Inicio de sesion en facebook
    private void inicioFace(){
        Intent fac = new Intent(Login.this,Paises.class);
        fac.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(fac);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode,resultCode, data);
    }

    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(firebaseAuthListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        firebaseAuth.removeAuthStateListener(firebaseAuthListener);
    }

    //firebase Aunthentication
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