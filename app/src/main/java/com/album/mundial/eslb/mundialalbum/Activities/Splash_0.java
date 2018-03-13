package com.album.mundial.eslb.mundialalbum.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.album.mundial.eslb.mundialalbum.SingletonStickers;

public class Splash_0 extends AppCompatActivity {

    Context context = this;

    SingletonStickers SS = SingletonStickers.get(getApplicationContext());
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //startActivity(new Intent(this,Logging_1.class ));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(context, Logging_1.class));
                finish();
            }
        }, 1000);   //5 seconds
    }

}
