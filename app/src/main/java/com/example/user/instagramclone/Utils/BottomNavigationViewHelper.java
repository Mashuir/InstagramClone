package com.example.user.instagramclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.user.instagramclone.Home.HomeActivity;
import com.example.user.instagramclone.Likes.LikesActivity;
import com.example.user.instagramclone.Profile.ProfileActivity;
import com.example.user.instagramclone.R;
import com.example.user.instagramclone.Search.SearchActivity;
import com.example.user.instagramclone.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent house = new Intent(context, HomeActivity.class);  //Activity_Num = 0
                        context.startActivity(house);
                        break;
                    case R.id.ic_search:
                        Intent search = new Intent(context, SearchActivity.class);  //Activity_Num = 1
                        context.startActivity(search);
                        break;
                    case R.id.ic_circle:
                        Intent circle = new Intent(context, ShareActivity.class);  //Activity_Num = 2
                        context.startActivity(circle);
                        break;
                    case R.id.ic_alert:
                        Intent alert = new Intent(context, LikesActivity.class);   //Activity_Num = 3
                        context.startActivity(alert);
                        break;
                    case R.id.ic_android:
                        Intent profile = new Intent(context, ProfileActivity.class);  //Activity_Num = 4
                        context.startActivity(profile);
                        break;
                }
                return false;
            }
        });
    }
}
