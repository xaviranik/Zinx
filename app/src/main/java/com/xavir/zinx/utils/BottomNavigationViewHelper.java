package com.xavir.zinx.utils;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.xavir.zinx.activities.HomeActivity;
import com.xavir.zinx.activities.ProfileActivity;
import com.xavir.zinx.R;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHelper";

    public static void setupBottomNavigationView(BottomNavigationView view, final Context context, final int activityNumber) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        context.startActivity(new Intent(context, HomeActivity.class));
                        break;
                    case R.id.menu_profile:
                        context.startActivity(new Intent(context, ProfileActivity.class));
                        break;
                }
                return false;
            }
        });

        view.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                return;
            }
        });

        MenuItem menuItem = view.getMenu().getItem(activityNumber);
        menuItem.setChecked(true);
    }
}
