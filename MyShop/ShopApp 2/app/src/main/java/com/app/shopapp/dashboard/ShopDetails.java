package com.app.shopapp.dashboard;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.app.shopapp.R;
import com.app.shopapp.dashboard.adapters.ShopListAdapter;
import com.app.shopapp.databinding.ShopDetailsBinding;

import java.util.ArrayList;

public class ShopDetails extends AppCompatActivity {

    private ShopDetailsBinding shopDetailsBinding;
    private ArrayList<String>arrayList;
    private ShopListAdapter shopListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        shopDetailsBinding = DataBindingUtil.setContentView(this, R.layout.shop_details);
        shopDetailsBinding.dashboardToolbar.toolBarTitle.setText("Shop Details");
        shopDetailsBinding.etShopName.setText("Shop 1");
        arrayList = new ArrayList<>();
        for (int i=0; i<5;i++){
            arrayList.add("Products "+(i+1));
        }

        shopDetailsBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        shopDetailsBinding.recyclerView.hasFixedSize();
        shopListAdapter = new ShopListAdapter(arrayList,this,true);
        shopDetailsBinding.recyclerView.setAdapter(shopListAdapter);

    }
}
