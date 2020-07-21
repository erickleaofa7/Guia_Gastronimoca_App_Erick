package com.erick.guia_gastronimoca_app.ControladorPeru;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerControler  extends FragmentPagerAdapter {
    int tabsPeru;

    public PagerControler(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.tabsPeru = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
              return new CostaPeru();

            case 1:
                return  new SierraPeru();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabsPeru;
    }
}
