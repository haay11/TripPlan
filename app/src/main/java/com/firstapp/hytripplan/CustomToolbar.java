package com.firstapp.hytripplan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomToolbar extends FrameLayout {
    FrameLayout toolbar_;
    TextView app_title;
    ImageView back, back_empty, forward, forward_empty;

    public CustomToolbar(Context context) {
        super(context);
        initView();
    }

    public CustomToolbar(AttributeSet attrs, Context context) {
        super(context, attrs);
        initView();
        getAttrs(attrs);
    }

    public CustomToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        initView();
        getAttrs(attrs, defStyleAttr);
    }


    @SuppressLint("ResourceType")
    private void initView() {

        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.main_toolbar, this, false);
        addView(v);

        toolbar_ = (FrameLayout) findViewById(R.id.toolbar_);
        app_title = (TextView) findViewById(R.id.app_title);
        back = (ImageView) findViewById(R.id.back);
        back_empty = (ImageView) findViewById(R.id.back_empty);
        forward = (ImageView) findViewById(R.id.forward);
        forward_empty = (ImageView) findViewById(R.id.forward_empty);

    }

    private void getAttrs(AttributeSet attrs) {

    }
    private void getAttrs(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.main_toolbar, defStyleAttr, 0);
        setTypeArray(typedArray);
    }

    private void setTypeArray(TypedArray typedArray) {

        String app_title_ID = typedArray.getString(R.styleable.main_toolbar_app_title);
        int back_ID = typedArray.getResourceId(R.styleable.main_toolbar_back, R.drawable.ic_iconfinder_back);
        back.setImageResource(back_ID);
        typedArray.recycle();


    }

    void setBack(int back_ID){
        back.setImageResource(back_ID);
    }

}
