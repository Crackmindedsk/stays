package com.sharlene.artbharatstays.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sharlene.artbharatstays.R;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {

    private String[] data;
    public RoomAdapter(String[] datalist){
        this.data=datalist;
    }

    @NonNull
    @Override
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.room_card,parent,false);
        return new RoomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomViewHolder holder, int position) {
        holder.getTextView().setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class RoomViewHolder extends RecyclerView.ViewHolder{
        private final TextView textView;
        public RoomViewHolder(View view){
            super(view);
            textView= view.findViewById(R.id.room_type);
        }
        public TextView getTextView(){
            return textView;
        }
    }
}
