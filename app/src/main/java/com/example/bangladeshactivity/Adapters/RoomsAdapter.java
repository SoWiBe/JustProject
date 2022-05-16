package com.example.bangladeshactivity.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bangladeshactivity.R;
import com.example.bangladeshactivity.RoomActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RoomsAdapter extends RecyclerView.Adapter<RoomsAdapter.ViewHolder> {

    private ArrayList<String> arrayList;

    public RoomsAdapter(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RoomsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_room, parent, false);
        CardView cardView = v.findViewById(R.id.cardMain);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent.getContext().startActivity(new Intent(parent.getContext(), RoomActivity.class));
            }
        });
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomsAdapter.ViewHolder holder, int position) {
        holder.txtTitle.setText(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        CardView cardMain;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            cardMain = itemView.findViewById(R.id.cardMain);
        }
    }
}
