package com.firstapp.hytripplan;

import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{


    Image image;
    //툴바 객체 선언
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //toolbar
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Trip Plan");
        setSupportActionBar(toolbar);


        image = findViewById(R.)




        //Compatibility checking
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10.f);
        }



    }

}
