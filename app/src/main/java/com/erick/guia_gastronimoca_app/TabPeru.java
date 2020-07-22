package com.erick.guia_gastronimoca_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.erick.guia_gastronimoca_app.ControladorPeru.PagerControler;
import com.erick.guia_gastronimoca_app.controlador.PagerController;
import com.google.android.material.tabs.TabLayout;

public class TabPeru extends AppCompatActivity {
    TabLayout tabLayoutPe;
    ViewPager viewPagerPe;
    PagerControler pagerControlerPe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_peru);
        tabLayoutPe = findViewById(R.id.tabLayoutPeru);
        viewPagerPe = findViewById(R.id.viepagerpe);

        pagerControlerPe = new PagerControler(getSupportFragmentManager(),tabLayoutPe.getTabCount());
        viewPagerPe.setAdapter(pagerControlerPe);
        tabLayoutPe.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerPe.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0){
                    pagerControlerPe.notifyDataSetChanged();
                }
                if(tab.getPosition()==1){
                    pagerControlerPe.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPagerPe.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayoutPe));
    }
}