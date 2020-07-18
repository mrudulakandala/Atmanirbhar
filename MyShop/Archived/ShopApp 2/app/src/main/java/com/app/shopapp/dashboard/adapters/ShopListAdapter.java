package com.app.shopapp.dashboard.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.shopapp.R;
import com.app.shopapp.dashboard.ShopDetails;

import java.util.ArrayList;

public class ShopListAdapter extends RecyclerView.Adapter<ShopListAdapter.ShopViewHolder> {


    private ArrayList<String>shopList;
    private Context context;

    private boolean enable;
    public ShopListAdapter(ArrayList<String> shopList, Context context,boolean enable) {
        this.shopList = shopList;
        this.context = context;
        this.enable= enable;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.shop_list_items, parent, false);

        return new ShopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {


        holder.tvShop.setText(shopList.get(position));
        holder.tvShop.setEnabled(enable);
        holder.tvShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ShopDetails.class);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return shopList.size();
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {


        private TextView tvShop;
        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);

            tvShop = itemView.findViewById(R.id.tvShop);


        }
    }
}
