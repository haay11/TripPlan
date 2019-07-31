package com.firstapp.hytripplan;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AddLikeSpace extends AppCompatActivity {

    //객체 선언
    TextView add_like_space_name, add_like_space_arr, add_space_text1;
    ImageView add_space_img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_like_space);
        add_like_space_arr = findViewById(R.id.add_like_space_arr);
        add_like_space_name = findViewById(R.id.add_like_space_name);
        add_space_text1 = findViewById(R.id.add_space_text1);
        add_space_img = findViewById(R.id.space_img);


    }


}
