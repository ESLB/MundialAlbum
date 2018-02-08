package com.album.mundial.eslb.mundialalbum.Otros;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.album.mundial.eslb.mundialalbum.R;

public class Splash_00 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity_00);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
               // startActivity(new Intent(getApplicationContext(), Logging_1.class));
            }
        }, 2000);   //5 seconds
        //finish();
    }
}
