package com.app.shopapp.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.app.shopapp.R;
import com.app.shopapp.adapter.ShopAdapter;
import com.app.shopapp.listners.BaseClickLisntner;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements BaseClickLisntner {
    RecyclerView products_view;

    List<Integer> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.shops_list);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        products_view = findViewById(R.id.products_view);
        loadValues();
        products_view.setHasFixedSize(true);
        products_view.setLayoutManager(new LinearLayoutManager(this));
        products_view.setAdapter(new ShopAdapter(images,this,0));


    }

    private void loadValues() {
        images.add(R.drawable.p2a1);
        images.add(R.drawable.p2a3);
        images.add(R.drawable.p2a2);
        images.add(R.drawable.p2a4);

    }

    @Override
    public void onItemClickLisnter(int pos) {
        Intent intent = new Intent(this, ProductActivity.class);
        startActivity(intent);

    }
}