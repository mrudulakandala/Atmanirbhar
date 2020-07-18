package com.app.shopapp.dashboard;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.app.shopapp.R;
import com.app.shopapp.dashboard.adapters.ShopListAdapter;
import com.app.shopapp.databinding.BuyerDashboardBinding;

import java.util.ArrayList;

public class BuyerDashboard extends AppCompatActivity {

    private BuyerDashboardBinding buyerDashboardBinding;
    private ArrayList<String>arrayList;
    private ShopListAdapter shopListAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buyerDashboardBinding = DataBindingUtil.setContentView(this, R.layout.buyer_dashboard);
        buyerDashboardBinding.dashboardToolbar.toolBarTitle.setText(getString(R.string.dashboard));

        arrayList = new ArrayList<>();
        for (int i=0; i<5;i++){
            arrayList.add("Shop"+(i+1));
        }

        buyerDashboardBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        buyerDashboardBinding.recyclerView.hasFixedSize();
        shopListAdapter = new ShopListAdapter(arrayList,this,true);
        buyerDashboardBinding.recyclerView.setAdapter(shopListAdapter);


    }
}
