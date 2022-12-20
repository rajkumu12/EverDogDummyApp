package com.wallet.everdogewallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_splash);
        nextActivity();
    }

    private void nextActivity() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
              startActivity(new Intent(SplashScreen.this,HomeActivity.class));
              finish();
            }
        }, 3000);
    }
}