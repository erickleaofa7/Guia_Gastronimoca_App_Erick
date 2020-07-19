package com.erick.guia_gastronimoca_app.Colombia.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.erick.guia_gastronimoca_app.controlador.FragmentCosta;
import com.erick.guia_gastronimoca_app.controlador.FragmentSierra;

public class PagerController extends FragmentPagerAdapter {
    int numOftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numOftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  new FragmentCostCol();
            case 1:
                return new FragmentSieCol();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numOftabs;
    }
}
