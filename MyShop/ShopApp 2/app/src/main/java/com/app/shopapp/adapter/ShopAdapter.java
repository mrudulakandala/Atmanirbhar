package com.app.shopapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.shopapp.R;
import com.app.shopapp.listners.BaseClickLisntner;
import com.app.shopapp.search.SearchActivity;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder> {

    List<Integer> data;
    BaseClickLisntner lisntner;
    int type;

    public ShopAdapter(List<Integer> data, BaseClickLisntner searchActivity,int type) {
        this.data = data;
        this.lisntner = searchActivity;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ShopViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, final int position) {
        holder.imageView.setImageResource(data.get(position));
        if(type == 0){
            holder.textView.setText(holder.imageView.getContext().getString(R.string.shop)+" - "+position);
        }else{
            holder.textView.setText(holder.imageView.getContext().getString(R.string.product)+" - "+position);
        }
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lisntner.onItemClickLisnter(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ShopViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView  = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

        }
    }
}
