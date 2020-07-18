package com.app.shopapp;

import android.os.Bundle;
import android.view.MenuItem;

import com.app.shopapp.ui.dashboard.DashboardFragment;
import com.app.shopapp.ui.home.HomeFragment;
import com.app.shopapp.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.bootom_tab_1);
        setSupportActionBar(toolbar);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, new HomeFragment()).commit();
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        //NavigationUI.setupWithNavController(navView, navController);

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager manager = getSupportFragmentManager();
                if(item.getItemId() == R.id.navigation_home){
                    toolbar.setTitle(R.string.bootom_tab_1);

                    manager.beginTransaction().replace(R.id.fragment_id, new HomeFragment()).commit();
                }else  if(item.getItemId() == R.id.navigation_dashboard){
                    toolbar.setTitle(R.string.bootom_tab_2);
                    manager.beginTransaction().replace(R.id.fragment_id, new DashboardFragment()).commit();
                }else  if(item.getItemId() == R.id.navigation_notifications){
                    toolbar.setTitle(R.string.bootom_tab_3);
                    manager.beginTransaction().replace(R.id.fragment_id, new NotificationsFragment()).commit();
                }
                return true;
            }
        });
    }

}