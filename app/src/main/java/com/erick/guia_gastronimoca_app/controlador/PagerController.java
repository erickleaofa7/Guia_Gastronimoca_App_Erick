package com.erick.guia_gastronimoca_app.controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int numTab;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numTab = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
             return  new FragmentCosta();
            case 1:
                return new FragmentSierra();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return numTab;
    }
}
