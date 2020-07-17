package com.app.shopapp.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.app.shopapp.HomeActivity;
import com.app.shopapp.dashboard.SellerDashboard;
import com.app.shopapp.R;
import com.app.shopapp.databinding.ActivityShopsetupBinding;

public class SetupShopActivity extends AppCompatActivity {

    private ActivityShopsetupBinding activityShopsetupBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityShopsetupBinding = DataBindingUtil.setContentView(this, R.layout.activity_shopsetup);

        activityShopsetupBinding.btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        activityShopsetupBinding.btnCreateShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SetupShopActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
