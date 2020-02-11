package com.xavir.zinx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.fxn.BubbleTabBar;
import com.fxn.OnBubbleClickListener;
import com.xavir.zinx.utils.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupBottomNavigationView();
    }

    private void setupBottomNavigationView() {
        BubbleTabBar bubbleTabBar = findViewById(R.id.bubble_tab_bar);
        BottomNavigationViewHelper.setupBottomNavigationView(bubbleTabBar, getApplicationContext());
    }
}
