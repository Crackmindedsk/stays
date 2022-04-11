package com.sharlene.artbharatstays.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sharlene.artbharatstays.HygeineShoppingActivity;
import com.sharlene.artbharatstays.R;

import java.util.List;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.SubCategoryViewHolder>{
    private List<String> data;
    public SubCategoryAdapter(List<String> list){
        this.data=list;
    }
    @NonNull
    @Override
    public SubCategoryAdapter.SubCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_list_card,parent,false);

        return new SubCategoryAdapter.SubCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubCategoryAdapter.SubCategoryViewHolder holder, int position) {
        holder.text.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class SubCategoryViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView image;

        public SubCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.category_name);
            image=itemView.findViewById(R.id.picture);
        }
    }
}
