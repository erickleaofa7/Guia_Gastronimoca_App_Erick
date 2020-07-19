package com.erick.guia_gastronimoca_app.Colombia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.erick.guia_gastronimoca_app.R;
import com.erick.guia_gastronimoca_app.controlador.PagerController;
import com.google.android.material.tabs.TabLayout;

import android.os.Bundle;

public class Tab_Colombia extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    PagerController pagerAdapterCol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab__colombia);

        pagerAdapterCol = new PagerController(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapterCol);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0){
                    pagerAdapterCol.notifyDataSetChanged();


                }
                if(tab.getPosition()==1){
                    pagerAdapterCol.notifyDataSetChanged();
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