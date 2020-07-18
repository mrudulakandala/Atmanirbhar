package com.app.shopapp.utils;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.util.Objects;

public class DatePicketFragment extends DialogFragment {
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    public DatePicketFragment(DatePickerDialog.OnDateSetListener callback) {
        mDateSetListener = (DatePickerDialog.OnDateSetListener) callback;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog =  new DatePickerDialog(Objects.requireNonNull(getActivity()),AlertDialog.THEME_DEVICE_DEFAULT_DARK,mDateSetListener,year,month,day);


        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis() - 1000);

        return datePickerDialog;
    }
}
