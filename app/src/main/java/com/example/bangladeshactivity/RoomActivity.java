package com.example.bangladeshactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bangladeshactivity.ui.HomeFragment;
import com.example.bangladeshactivity.ui.Room.LightFragment;
import com.example.bangladeshactivity.ui.Room.ThermostatFragment;

public class RoomActivity extends AppCompatActivity {

    private LinearLayout llLight, llThermostat;
    private FragmentManager fragmentManager;
    private Fragment lightFragment = new LightFragment();
    private Fragment thermostatFragment = new ThermostatFragment();
    private Fragment active;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        fragmentManager = getSupportFragmentManager();
        active = lightFragment;

        fragmentManager.beginTransaction().add(R.id.room_container, lightFragment, "light").commit();
        llLight = findViewById(R.id.llLight);
        llThermostat = findViewById(R.id.llThermostat);
        llLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().add(R.id.room_container, lightFragment, "light").hide(active).commit();
                active = lightFragment;
            }
        });

        llThermostat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().add(R.id.room_container, thermostatFragment, "thermostat").hide(active).commit();
                active = thermostatFragment;
            }
        });
    }
}