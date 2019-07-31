package com.firstapp.hytripplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class SpaceActivity extends AppCompatActivity {
    private TextView space_explain, space_name;
    private ImageView share_image_bt, review_image_bt, add_list_image_bt, heart_image_bt, space_img, info_image_bt;
    public String name, change;
    int check = 1, check1 = 1;
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
        info_image_bt = findViewById(R.id.info_image_bt);

        Adapter ad;


        final Intent intent = getIntent();


        if (intent.hasExtra("key_name")){
            name = intent.getExtras().getString("key_name");
            space_name.setText(name);
            setImg(name);

        }

        info_image_bt.setBackgroundColor(getResources().getColor(R.color.windowBackground));

        heart_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check == 1){
                    heart_image_bt.setImageResource(R.drawable.ic_iconfinder_heart1);
                    Toast.makeText(getApplicationContext(), "찜 등록 하였습니다!", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(SpaceActivity.this, AddLikeSpace.class);
                    intent1.putExtra("key_name", name);
                    startService(intent1);
                    check ++;
                } else if(check == 2){
                    heart_image_bt.setImageResource(R.drawable.ic_iconfinder_heart);
                    Toast.makeText(getApplicationContext(), "찜을 해제하였습니다.", Toast.LENGTH_SHORT).show();
                    check --;
                }


            }
        });

        add_list_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check1 == 1){
                    add_list_image_bt.setImageResource(R.drawable.ic_icon_add_list1);
                    Toast.makeText(getApplicationContext(), "일정 리스트에 등록 하였습니다!", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(SpaceActivity.this, MakePlan.class);
                    intent2.putExtra("key_name", name);
                    startService(intent2);
                    check1 ++;
                } else if(check1 == 2){
                    add_list_image_bt.setImageResource(R.drawable.ic_icon_add_list);
                    Toast.makeText(getApplicationContext(), "일정 리스트에서 제거하였습니다.", Toast.LENGTH_SHORT).show();
                    check1 --;
                }
            }
        });

        info_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change = "info_image_bt";
                changeColor(change);
            }
        });

        review_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change = "review_image_bt";
                changeColor(change);
            }
        });

        share_image_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change = "share_image_bt";
                changeColor(change);
            }
        });


    }

    private void setImg(String space) {

        switch (space){
            case "파리":
                space_img.setImageResource(R.drawable.paris);
                space_img.setVisibility(View.VISIBLE);
                break;
            case "로마":
                space_img.setImageResource(R.drawable.rome);
                space_img.setVisibility(View.VISIBLE);
                break;
            case "시에나":
                space_img.setImageResource(R.drawable.siena);
                space_img.setVisibility(View.VISIBLE);
                break;
            case "서울":
                space_img.setImageResource(R.drawable.seoul);
                space_img.setVisibility(View.VISIBLE);
                break;
            case "니스":
                space_img.setImageResource(R.drawable.nice);
                space_img.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void changeColor(String change){
        if("review_image_bt".equals(change)){
            review_image_bt.setBackgroundColor(getResources().getColor(R.color.windowBackground));
            share_image_bt.setBackgroundColor(getResources().getColor(R.color.white));
            info_image_bt.setBackgroundColor(getResources().getColor(R.color.white));
        } else if("share_image_bt".equals(change)){
             review_image_bt.setBackgroundColor(getResources().getColor(R.color.white));
            share_image_bt.setBackgroundColor(getResources().getColor(R.color.windowBackground));
            info_image_bt.setBackgroundColor(getResources().getColor(R.color.white));
        } else if("info_image_bt".equals(change)){
            review_image_bt.setBackgroundColor(getResources().getColor(R.color.white));
            share_image_bt.setBackgroundColor(getResources().getColor(R.color.white));
            info_image_bt.setBackgroundColor(getResources().getColor(R.color.windowBackground));
        }
    }




}
