package com.firstapp.hytripplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Space extends AppCompatActivity {
    private TextView space_explain, space_name;
    private ImageView share_image_bt, review_image_bt, add_list_image_bt, heart_image_bt, space_img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.space);


        space_explain = findViewById(R.id.space_explain);
        space_name = findViewById(R.id.space_name);
        share_image_bt = findViewById(R.id.share_image_bt);
        review_image_bt = findViewById(R.id.review_image_bt);
        add_list_image_bt = findViewById(R.id.add_list_image_bt);
        heart_image_bt =  findViewById(R.id.heart_image_bt);
        space_img = findViewById(R.id.space_img);

        Adapter ad;


        final Intent intent = getIntent();

        Toast.makeText(getApplicationContext(), getIntent().toString(), Toast.LENGTH_SHORT).show();

        if (intent.hasExtra("key_name")){
            String name = intent.getExtras().toString();
            space_name.setText(name);
            Toast.makeText(getApplicationContext(), space_name.getText(), Toast.LENGTH_SHORT).show();
            setImg(getIntent().toString());


        }
        space_name.setText(intent.getStringExtra("key_name"));

        heart_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heart_image_bt.setBackgroundColor(getResources().getColor(R.color.windowBackground));


            }
        });

        add_list_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_list_image_bt.setBackgroundColor(getResources().getColor(R.color.windowBackground));
            }
        });

        review_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                review_image_bt.setBackgroundColor(getResources().getColor(R.color.windowBackground));
            }
        });

        share_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    private void setImg(String space) {

        switch (space){
            case "파리":
                space_img.setImageResource(R.drawable.paris);
                space_img.setVisibility(View.VISIBLE);
                break;
        }
    }


}
