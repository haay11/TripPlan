package com.firstapp.hytripplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class SpaceActivity extends AppCompatActivity {
    private TextView spaceExplain, spaceName;
    private ImageView shareImageBtn, reviewImageBtn, addListImageBtn, heartImageBtn, spaceImg, infoImageBtn;
    private String name, changeColor;
    private int changeBtn1 = 1, changeBtn2 = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.space);


        spaceExplain = findViewById(R.id.space_explain);
        spaceName = findViewById(R.id.space_name);
        shareImageBtn = findViewById(R.id.share_image_bt);
        reviewImageBtn = findViewById(R.id.review_image_bt);
        addListImageBtn = findViewById(R.id.add_list_image_bt);
        heartImageBtn =  findViewById(R.id.heart_image_bt);
        spaceImg = findViewById(R.id.space_img);
        infoImageBtn = findViewById(R.id.info_image_bt);


        final Intent intent = getIntent();


        if (intent.hasExtra("key_name")){
            name = intent.getExtras().getString("key_name");
            spaceName.setText(name);
            setImg(name);

        }

        infoImageBtn.setBackgroundColor(getResources().getColor(R.color.windowBackground));

        heartImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (changeBtn1 == 1){
                    heartImageBtn.setImageResource(R.drawable.ic_iconfinder_heart1);
                    Toast.makeText(getApplicationContext(), "찜 등록 하였습니다!", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(SpaceActivity.this, AddLikeSpace.class);
                    intent1.putExtra("key_name", name);
                    startService(intent1);
                    changeBtn1 ++;
                } else if(changeBtn1 == 2){
                    heartImageBtn.setImageResource(R.drawable.ic_iconfinder_heart);
                    Toast.makeText(getApplicationContext(), "찜을 해제하였습니다.", Toast.LENGTH_SHORT).show();
                    changeBtn1 --;
                }


            }
        });

        addListImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (changeBtn2 == 1){
                    addListImageBtn.setImageResource(R.drawable.ic_icon_add_list1);
                    Toast.makeText(getApplicationContext(), "일정 리스트에 등록 하였습니다!", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(SpaceActivity.this, MakePlanActivity.class);
                    intent2.putExtra("key_name", name);
                    startService(intent2);
                    changeBtn2 ++;
                } else if(changeBtn2 == 2){
                    addListImageBtn.setImageResource(R.drawable.ic_icon_add_list);
                    Toast.makeText(getApplicationContext(), "일정 리스트에서 제거하였습니다.", Toast.LENGTH_SHORT).show();
                    changeBtn2 --;
                }
            }
        });

        infoImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor = "info_image_bt";
                changeColor(changeColor);
            }
        });

        reviewImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor = "review_image_bt";
                changeColor(changeColor);
            }
        });

        shareImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor = "share_image_bt";
                changeColor(changeColor);
            }
        });


    }

    private void setImg(String space) {

        switch (space){
            case "파리":
                spaceImg.setImageResource(R.drawable.paris);
                spaceImg.setVisibility(View.VISIBLE);
                break;
            case "로마":
                spaceImg.setImageResource(R.drawable.rome);
                spaceImg.setVisibility(View.VISIBLE);
                break;
            case "시에나":
                spaceImg.setImageResource(R.drawable.siena);
                spaceImg.setVisibility(View.VISIBLE);
                break;
            case "서울":
                spaceImg.setImageResource(R.drawable.seoul);
                spaceImg.setVisibility(View.VISIBLE);
                break;
            case "니스":
                spaceImg.setImageResource(R.drawable.nice);
                spaceImg.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void changeColor(String change){
        if("review_image_bt".equals(change)){
            reviewImageBtn.setBackgroundColor(getResources().getColor(R.color.windowBackground));
            shareImageBtn.setBackgroundColor(getResources().getColor(R.color.white));
            infoImageBtn.setBackgroundColor(getResources().getColor(R.color.white));
        } else if("share_image_bt".equals(change)){
             reviewImageBtn.setBackgroundColor(getResources().getColor(R.color.white));
            shareImageBtn.setBackgroundColor(getResources().getColor(R.color.windowBackground));
            infoImageBtn.setBackgroundColor(getResources().getColor(R.color.white));
        } else if("info_image_bt".equals(change)){
            reviewImageBtn.setBackgroundColor(getResources().getColor(R.color.white));
            shareImageBtn.setBackgroundColor(getResources().getColor(R.color.white));
            infoImageBtn.setBackgroundColor(getResources().getColor(R.color.windowBackground));
        }
    }




}
