package com.xavir.zinx.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.xavir.zinx.R;
import com.xavir.zinx.utils.BottomNavigationViewHelper;

public class ProfileActivity extends AppCompatActivity {

    private static final int ACTIVITY_NUM = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
//        setupBottomNavigationView();
        setupToolbar();
    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar_profile);
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_profile_settings:
                        break;
                }
                return false;
            }
        });
    }

    private void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView, getApplicationContext(), ACTIVITY_NUM);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar_profile, menu);
        return true;
    }
}
