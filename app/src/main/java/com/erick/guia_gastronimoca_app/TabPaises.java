package com.erick.guia_gastronimoca_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.erick.guia_gastronimoca_app.controlador.PagerController;
import com.google.android.material.tabs.TabLayout;

public class TabPaises extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerController pagerAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_paises);
        tabLayout = findViewById(R.id.tabPais);
        viewPager = findViewById(R.id.viepager);
        encebollado = findViewById(R.id.btnEncebollado);



        pagerAdapter = new PagerController(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
             viewPager.setCurrentItem(tab.getPosition());
             if(tab.getPosition()==0){
                 pagerAdapter.notifyDataSetChanged();


             }
                if(tab.getPosition()==1){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}