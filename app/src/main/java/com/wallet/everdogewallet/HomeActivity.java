package com.wallet.everdogewallet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_home);


        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottomNavigationView);

        loadFragment(new HomeFragment());
        bottomNavigationView.setOnItemSelectedListener(this::onNavigationItemSelected);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                MyCustom.showDailog(HomeActivity.this);
            }
        }, 500);


    }



    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, fragment)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.wallet:
                loadFragment(new HomeFragment());
                break;
            case R.id.market:
                loadFragment(new MarketFragments());
                break;
            case R.id.gallery:
                loadFragment(new GalleryFragment());
                break;
            case R.id.move:
                loadFragment(new MoveFragments());
                break;
            case R.id.menu:
                loadFragment(new MenusFragments());
           


        }
        return true;
    }

}