package com.firstapp.hytripplan;

import android.arch.lifecycle.Lifecycling;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.UpdateLayout;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;




public class SearchSpace extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //객체 선언
    private ArrayList<String> list;
    private ListView add_search_list;
    private EditText add_search_edit;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_space);

       add_search_edit = findViewById(R.id.add_search_edit);
       add_search_list = findViewById(R.id.add_search_list);

        //리스트 생성;
        list = new ArrayList<String>();

        //리스트에 검색할 데이터 추가
        setList();

        final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.add_search_edit);

        //adapter연결
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, list);
        autoCompleteTextView.setAdapter(adapter);
        add_search_edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }



    private void setList(){
        list.add("파리");
        list.add("로마");
        list.add("시에나");
        list.add("서울");
        list.add("니스");
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    }
}
