package com.firstapp.hytripplan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MakePlan extends AppCompatActivity {
    public EditText plan_title, day_start, day_end;
    public ImageView cal_image, map_image;
    public Button plan_save_btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_plan1);

        plan_title = findViewById(R.id.plan_title);
        day_start = findViewById(R.id.day_start);
        day_end = findViewById(R.id.day_end);
        cal_image = findViewById(R.id.cal_image);
        map_image = findViewById(R.id.map_image);
        plan_save_btn = findViewById(R.id.plan_save_btn);
    }
}
