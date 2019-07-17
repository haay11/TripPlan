package com.firstapp.hytripplan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class Splash extends AppCompatActivity {
    private  int time = 3000;   //3초
    Intent intent;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_splash);
        Handler hd = new Handler();

        hd.postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, time);

    }

    }

