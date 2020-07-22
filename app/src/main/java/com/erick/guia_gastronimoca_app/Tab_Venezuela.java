package com.erick.guia_gastronimoca_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.erick.guia_gastronimoca_app.ControladorVenezuela.PagerControler;
import com.google.android.material.tabs.TabLayout;

public class Tab_Venezuela extends AppCompatActivity {
    TabLayout tabLayoutVen;
    ViewPager viewPagerVen;
    PagerControler pageControlerVen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab__venezuela);
        tabLayoutVen = findViewById(R.id.tabLayoutVenezuela);
        viewPagerVen = findViewById(R.id.viewpagerVen);

        pageControlerVen = new PagerControler(getSupportFragmentManager(), tabLayoutVen.getTabCount());
        viewPagerVen.setAdapter(pageControlerVen);
        tabLayoutVen.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerVen.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0) {
                    pageControlerVen.notifyDataSetChanged();
                }
                if(tab.getPosition()==1){
                    pageControlerVen.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPagerVen.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayoutVen));
    }
}