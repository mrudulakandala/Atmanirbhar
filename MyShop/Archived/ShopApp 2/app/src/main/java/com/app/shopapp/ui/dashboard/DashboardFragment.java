package com.app.shopapp.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.shopapp.R;
import com.app.shopapp.adapter.ShopAdapter;
import com.app.shopapp.dashboard.SellerDashboard;
import com.app.shopapp.listners.BaseClickLisntner;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment implements BaseClickLisntner {

    private DashboardViewModel dashboardViewModel;
    List<Integer> images = new ArrayList<>();


    RecyclerView products_view;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        loadValues();
        products_view = root.findViewById(R.id.products_view);

        root.findViewById(R.id.add_item_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAddItem();
            }
        });

        products_view.setHasFixedSize(true);
        products_view.setLayoutManager(new GridLayoutManager(getContext(),2));
        products_view.setAdapter(new ShopAdapter(images,this,1));



        return root;
    }

    private void loadAddItem() {
        Intent intent = new Intent(getActivity(), SellerDashboard.class);
        startActivity(intent);
    }

    private void loadValues() {
        images.add(R.drawable.p5);
        images.add(R.drawable.p5a1);
        images.add(R.drawable.p5a2);
        images.add(R.drawable.p5a3);
        images.add(R.drawable.p5a4);
        images.add(R.drawable.p5a5);
    }

    @Override
    public void onItemClickLisnter(int pos) {

    }
}