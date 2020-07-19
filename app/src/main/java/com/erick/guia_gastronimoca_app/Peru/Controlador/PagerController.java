package com.erick.guia_gastronimoca_app.Peru.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.erick.guia_gastronimoca_app.controlador.FragmentCosta;
import com.erick.guia_gastronimoca_app.controlador.FragmentSierra;

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
                return  new FragmentCostaPe();
            case 1:
                return new FragmentSierraPe();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numTab;
    }
}
