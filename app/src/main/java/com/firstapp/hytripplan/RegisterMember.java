package com.firstapp.hytripplan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.firstapp.hytripplan.login.LoginActivity;

public class RegisterMember extends AppCompatActivity {
    private Button btnCancel, btnSave;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_member);

        btnCancel = findViewById(R.id.cancel_btn);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelInten = new Intent(RegisterMember.this, LoginActivity.class);
                startActivity(cancelInten);
                finish();
            }
        });
    }
}
