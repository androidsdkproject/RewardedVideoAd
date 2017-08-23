package com.example.android1.rewardedvideoad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void videoadd(View view) {
        Intent in = new Intent(HomeActivity.this, VideoAds.class);
        startActivity(in);

    }

    public void nativeexpress(View view) {
        Intent nat = new Intent(HomeActivity.this, NativeExpressAds.class);
        startActivity(nat);
    }

    public void nativeadvance(View view) {
        Intent inm = new Intent(HomeActivity.this, NativeAdvanceAd.class);
        startActivity(inm);
    }
}
