package com.app.shopapp.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.app.shopapp.R;
import com.app.shopapp.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding activityRegisterBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityRegisterBinding = DataBindingUtil.setContentView(this, R.layout.activity_register);


        activityRegisterBinding.btnSetupShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(RegisterActivity.this,SetupShopActivity.class);
                startActivity(i);

            }
        });

        activityRegisterBinding.btnStartBuying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this,StartBuyingActivity.class);
                startActivity(i);
            }
        });

    }
}
