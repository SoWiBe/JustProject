package com.example.bangladeshactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bangladeshactivity.ui.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    private FragmentManager fragmentManager;
    private Fragment homeFragment = new HomeFragment();
    private Fragment active;
    private BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);
        active = homeFragment;
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.main_container, homeFragment, "home").commit();

        bottomNavigationView.setOnItemSelectedListener(onNavigationItemSelectedListener);

    }


    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.home:
                    fragmentManager.beginTransaction().add(R.id.main_container, homeFragment, "home").hide(active).commit();
                    active = homeFragment;
                    return true;
            }
            return false;
        }
    };
}