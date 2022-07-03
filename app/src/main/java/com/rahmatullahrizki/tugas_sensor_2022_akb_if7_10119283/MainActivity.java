package com.rahmatullahrizki.tugas_sensor_2022_akb_if7_10119283;
//         NIM: 10119183
//         Nama: Rahmatullah Rizki
//         Kelas: IF-7
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FragmentProfile fragmentProfile = new FragmentProfile();
    FragmentAppInfo fragmentAppInfo = new FragmentAppInfo();
    FragmentFood fragmentFood = new FragmentFood();
    FragmentLocation fragmentLocation = new FragmentLocation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.nav_botom);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentProfile).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentProfile).commit();
                        return true;

                    case R.id.nav_notification:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentAppInfo).commit();
                        return true;

                    case R.id.nav_rumah_makan:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentFood).commit();
                        return true;

                    case R.id.nav_lokasi:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentLocation).commit();
                        return true;
                }
                return false;
            }
        });
    }
}