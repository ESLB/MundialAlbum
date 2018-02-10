package com.album.mundial.eslb.mundialalbum.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.album.mundial.eslb.mundialalbum.R;

public class Logging_1 extends AppCompatActivity {

    private ImageView mLogo;
    private Button mIniciarSesion;
    private EditText mEmail, mContrasena;

    private String [] datos = {"eslevano@hotmail.com", "123456789"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logging_activity_1);

        mLogo = (ImageView) findViewById(R.id.logoLogging);
        mIniciarSesion = (Button) findViewById(R.id.iniciarSesion);
        mEmail = (EditText) findViewById(R.id.loggingEmail);
        mContrasena = (EditText) findViewById(R.id.loggingContrasena);

        mLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEmail.setText(datos[0]);
                mContrasena.setText(datos[1]);
            }
        });

        mIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEmail.getText()!=null||mContrasena.getText()!=null)
                {
                    if(mEmail.getText().toString().equals(datos[0])||mContrasena.getText().toString().equals(datos[1])){
                        startActivity(new Intent(getApplicationContext(), Central_4.class));
                        finish();
                    }
                } else{
                    Toast.makeText(Logging_1.this, "Usuario no registrado o datos incorrectos", Toast.LENGTH_SHORT).show();
                }

            } 
        });

    }


}
