package com.firstapp.hytripplan.search;


import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.firstapp.hytripplan.R;

import java.util.ArrayList;


public class SearchSpaceActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //객체 선언
    private ArrayList<String> spaceNameList;
    private ArrayList<Integer> cityList;
    private ListView addSearchList;
    private EditText addSearchEdit;
    private ArrayAdapter<String> adapter;
    private String keyword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_search_space);

       addSearchEdit = findViewById(R.id.add_search_edit);
       addSearchList = findViewById(R.id.add_search_list);

        addSearchEdit.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                   searchByKeyword(v.getText().toString());
                        return false;
                }
                return true;
            }
        });


        //adapter연결
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, spaceNameList);
        addSearchList.setAdapter(adapter);
        addSearchList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                searchByKeyword(adapter.getItem(i));
            }
        });
    }

    private void searchByKeyword(String keyword){
        Intent intent = new Intent(SearchSpaceActivity.this, SpaceActivity.class);
        intent.putExtra("key_name", keyword);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    }
}
