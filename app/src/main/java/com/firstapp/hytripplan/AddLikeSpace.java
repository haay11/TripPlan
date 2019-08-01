package com.firstapp.hytripplan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AddLikeSpace extends AppCompatActivity {

    //객체 선언
    private TextView add_likeSpaceName, addLikeSpaceArr, addSpaceText1;
    private ImageView addSpaceImg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_like_space);
        addLikeSpaceArr = findViewById(R.id.add_like_space_arr);
        add_likeSpaceName = findViewById(R.id.add_like_space_name);
        addSpaceText1 = findViewById(R.id.add_space_text1);
        addSpaceImg = findViewById(R.id.space_img);


    }


}
