package com.app.shopapp.register;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.app.shopapp.HomeActivity;
import com.app.shopapp.dashboard.BuyerDashboard;
import com.app.shopapp.dashboard.SellerDashboard;
import com.app.shopapp.R;
import com.app.shopapp.databinding.ActivityStartbuyingBinding;
import com.app.shopapp.utils.DatePicketFragment;

public class StartBuyingActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {


    private ActivityStartbuyingBinding activityStartbuyingBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityStartbuyingBinding = DataBindingUtil.setContentView(this, R.layout.activity_startbuying);

        activityStartbuyingBinding.etDob.setKeyListener(null);
        activityStartbuyingBinding.etDob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicketFragment datePicketFragment = new DatePicketFragment(StartBuyingActivity.this);
                datePicketFragment.show(getSupportFragmentManager(),"Date Picker");

            }
        });

        activityStartbuyingBinding.btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        activityStartbuyingBinding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StartBuyingActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

    }
}
