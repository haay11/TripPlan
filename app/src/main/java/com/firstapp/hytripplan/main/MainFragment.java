package com.firstapp.hytripplan.main;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.firstapp.hytripplan.make.MakePlanActivity;
import com.firstapp.hytripplan.make.PlanDataHelper;
import com.firstapp.hytripplan.R;
import com.firstapp.hytripplan.search.SearchSpaceActivity;

public class MainFragment extends Fragment {

    //객체 선언
    private Intent intent;
    private EditText searchEdit;
    private ImageView addImage;
    private TextView text1;
    private ListView listView,listView_;

    //DB
    private PlanDataHelper planData;
    private SQLiteDatabase db;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        setUpView(view);
        setUpDb();
        return view;
    }

    private void setUpView(View view) {
        text1 = view.findViewById(R.id.text_1);
        listView = view.findViewById(R.id.list_view);
        //일정 추가
        addImage = view.findViewById(R.id.add_image);
        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), MakePlanActivity.class);
                startActivity(intent);
            }
        });

        //장소 검색
        searchEdit = view.findViewById(R.id.search_edit);
        searchEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), SearchSpaceActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpDb(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                db = planData.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT tripTitle FROM tripPlan",null);
                Log.e("db", cursor+"");
            }
        });
    }

    public static MainFragment newInstance(){
        Bundle args = new Bundle();

        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }
}