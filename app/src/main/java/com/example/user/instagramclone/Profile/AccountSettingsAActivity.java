package com.example.user.instagramclone.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.user.instagramclone.R;

import java.util.ArrayList;

public class AccountSettingsAActivity extends AppCompatActivity {

    private static final String TAG = "AccountSettingsAActivit";
    private Context mContext ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountsettings);
        mContext = AccountSettingsAActivity.this;

        Log.d(TAG, "onCreate: ");

        setupSettingsList();

        //setup backarrow from account settings

        ImageView backArrow = findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: navigating back to profile activity");
                finish();
            }
        });
    }

    private void setupSettingsList(){
        Log.d(TAG, "setupSettingsList: started");

        ListView listView = findViewById(R.id.lvAccountSettings);
        ArrayList<String> options = new ArrayList<>();
        options.add(getString(R.string.edit_profile));
        options.add(getString(R.string.sign_out));

        ArrayAdapter<String> adapter = new ArrayAdapter(mContext,android.R.layout.simple_list_item_1,options);
        listView.setAdapter(adapter);
    }
}
