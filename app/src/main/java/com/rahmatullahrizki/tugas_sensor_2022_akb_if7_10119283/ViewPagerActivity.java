package com.rahmatullahrizki.tugas_sensor_2022_akb_if7_10119283;
//         NIM: 10119183
//         Nama: Rahmatullah Rizki
//         Kelas: IF-7
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;


public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ArrayList<Model> modelArrayList;
    private ViewPagerAdapter adapter;
    private MaterialButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager = findViewById(R.id.viewPager);
        loadCards();viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                String title = modelArrayList.get(position).getTitle();
                if(position == modelArrayList.size()-1){
                    button.setText("Started");
                }else {
                    button.setText("Next");
                }

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(viewPager.getCurrentItem()+1<modelArrayList.size()){
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                }else{
                    //kembali ke main activity
                    startActivity(new Intent(ViewPagerActivity.this, MainActivity.class));
                    finish();
                }
            }
        });
    }

    private void loadCards() {
        modelArrayList = new ArrayList<>();

        modelArrayList.add(new Model("Find your favorite place!","Tandai tempat makan favoritmu!",R.drawable.burger));
        modelArrayList.add(new Model("Know your location!","Anda dapat melihat sedang ada dimana Anda sekarang!",R.drawable.location));

        adapter = new ViewPagerAdapter(this,modelArrayList);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(100,0,100,0);
    }
}