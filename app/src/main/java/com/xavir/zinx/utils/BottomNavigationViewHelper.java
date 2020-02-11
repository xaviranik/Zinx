package com.xavir.zinx.utils;

import android.content.Context;
import android.widget.Toast;

import com.fxn.BubbleTabBar;
import com.fxn.OnBubbleClickListener;
import com.xavir.zinx.R;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHelper";

    public static void setupBottomNavigationView(BubbleTabBar bubbleTabBar, final Context context) {
        bubbleTabBar.addBubbleListener(new OnBubbleClickListener() {
            @Override
            public void onBubbleClick(int i) {
                switch (i) {
                    case R.id.menu_home:
                        Toast.makeText(context, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_search:
                        Toast.makeText(context, "Search", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
