package com.erick.guia_gastronimoca_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.erick.guia_gastronimoca_app.ControladorColombia.PagerControler;
import com.google.android.material.tabs.TabLayout;

public class Tab_Colombia extends AppCompatActivity {
    TabLayout tabLayoutCol;
    ViewPager viewPagerCol;
    PagerControler pagerControlerCol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab__colombia);
        tabLayoutCol = findViewById(R.id.tabLayoutColombia);
        viewPagerCol = findViewById(R.id.viewPagerCol);

        pagerControlerCol = new PagerControler(getSupportFragmentManager(), tabLayoutCol.getTabCount());
        viewPagerCol.setAdapter(pagerControlerCol);
        tabLayoutCol.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerCol.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pagerControlerCol.notifyDataSetChanged();
                }
                if (tab.getPosition() == 1) {
                    pagerControlerCol.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPagerCol.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayoutCol));
    }
}











