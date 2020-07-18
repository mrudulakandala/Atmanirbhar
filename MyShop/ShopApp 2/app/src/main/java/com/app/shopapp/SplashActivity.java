package com.app.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;

import java.util.Locale;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Locale myLocale = new Locale("hi");
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadNextScreen();
            }
        },SPLASH_TIME_OUT);
    }

    private void loadNextScreen() {
        Intent intent = new Intent(SplashActivity.this, OTPActivity.class);
        startActivity(intent);
        finish();
    }
}