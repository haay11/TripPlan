package com.firstapp.hytripplan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MakePlanActivity extends AppCompatActivity {
    private EditText planTitle, dayStart, dayEnd;
    private ImageView calImage, mapImage;
    private Button planSaveBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_plan1);

        planTitle = findViewById(R.id.plan_title);
        dayStart = findViewById(R.id.day_start);
        dayEnd = findViewById(R.id.day_end);
        calImage = findViewById(R.id.cal_image);
        mapImage = findViewById(R.id.map_image);
        planSaveBtn = findViewById(R.id.plan_save_btn);
    }
}
