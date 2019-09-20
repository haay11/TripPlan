package com.firstapp.hytripplan.main;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.firstapp.hytripplan.CustomToolbar;
import com.firstapp.hytripplan.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private CustomToolbar toolbar = findViewById(R.id.toolbar);
    private NavigationView navigationView = findViewById(R.id.nav_view);
    private DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolBarAndNavigationView();
        switchFragment(MainFragment.newInstance());
    }

    private void switchFragment(MainFragment newInstance) {
    }

    private void setUpToolBarAndNavigationView() {
        toolbar.app_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("navi","눌림");
                if (drawerLayout.isDrawerOpen(navigationView)){
                    drawerLayout.closeDrawer(Gravity.LEFT);
                }else {
                    drawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });     }

    public void switchFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack(null)
                .commit(); }

}
