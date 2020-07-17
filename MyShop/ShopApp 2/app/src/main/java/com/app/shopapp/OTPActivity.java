package com.app.shopapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.app.shopapp.databinding.ActivityOtpBinding;
import com.app.shopapp.login.LoginActivity;
import com.app.shopapp.register.RegisterActivity;

public class OTPActivity extends AppCompatActivity {

    private ActivityOtpBinding activityOtpBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityOtpBinding = DataBindingUtil.setContentView(this, R.layout.activity_otp);
        activityOtpBinding.btnSendOtp.setVisibility(View.VISIBLE);
        activityOtpBinding.etOtp.setVisibility(View.VISIBLE);



        activityOtpBinding.btnSendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityOtpBinding.btnSendOtp.setVisibility(View.GONE);
                activityOtpBinding.etOtp.setVisibility(View.VISIBLE);

            }
        });

        activityOtpBinding.btnSendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(OTPActivity.this, HomeActivity.class);
                startActivity(i);


            }
        });





    }
}
