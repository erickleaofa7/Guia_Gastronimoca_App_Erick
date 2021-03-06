package com.erick.guia_gastronimoca_app.ControladorColombia;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagerControler extends FragmentPagerAdapter {
    int tabCol;

    public PagerControler(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.tabCol = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return  new costaColombia();
            case 1:
                return  new sierraColombia();
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return tabCol;
    }
}
