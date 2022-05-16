package com.example.bangladeshactivity.ui.Room;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bangladeshactivity.R;


public class LightFragment extends Fragment {

    public LightFragment() {
        // Required empty public constructor
    }


    public static LightFragment newInstance(String param1, String param2) {
        LightFragment fragment = new LightFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_light, container, false);
        return v;
    }
}