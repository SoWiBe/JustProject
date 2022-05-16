package com.example.bangladeshactivity.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bangladeshactivity.Adapters.RoomsAdapter;
import com.example.bangladeshactivity.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    private RecyclerView recyclerRoom;
    private RoomsAdapter roomAdapter;
    private ArrayList<String> mainList;
    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_home, container, false);
        recyclerRoom = v.findViewById(R.id.recyclerRooms);
        recyclerRoom.setLayoutManager(new GridLayoutManager(getContext(), 2));
        mainList = new ArrayList<>();
        mainList.add("Living Room");
        mainList.add("Kitchen");
        mainList.add("Bathroom");
        roomAdapter = new RoomsAdapter(mainList);
        recyclerRoom.setAdapter(roomAdapter);
        return v;
    }
}