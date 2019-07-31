package com.firstapp.hytripplan;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    //객체 선언
    Intent intent;
    EditText search_edit;
    ImageView add_image;

    //툴바 객체 선언
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //일정 추가
        add_image = findViewById(R.id.add_image);
        add_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MakePlan.class);
                startActivity(intent);
            }
        });

        //장소 검색
        search_edit = findViewById(R.id.search_edit);
        search_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, SearchSpaceActivity.class);
                startActivity(intent);
            }
        });







        //Compatibility checking
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10.f);
        }



    }

}
