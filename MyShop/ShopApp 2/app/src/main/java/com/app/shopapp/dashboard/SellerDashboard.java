package com.app.shopapp.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.app.shopapp.R;
import com.app.shopapp.databinding.SellerDashboardBinding;

public class SellerDashboard extends AppCompatActivity {

    private SellerDashboardBinding sellerDashboardBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sellerDashboardBinding = DataBindingUtil.setContentView(this,R.layout.seller_dashboard);
        sellerDashboardBinding.dashboardToolbar.toolBarTitle.setText(getString(R.string.seller_dashboard));


    }
}