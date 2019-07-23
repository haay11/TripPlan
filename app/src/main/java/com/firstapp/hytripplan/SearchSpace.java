package com.firstapp.hytripplan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchSpace extends AppCompatActivity {

    EditText add_search_edit;
    ListView add_search_list;
    ArrayList<String> add_search_arr = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_space);

        add_search_edit = this.findViewById(R.id.add_search_edit);
        add_search_list = this.findViewById(R.id.add_search_list);


    }
}
