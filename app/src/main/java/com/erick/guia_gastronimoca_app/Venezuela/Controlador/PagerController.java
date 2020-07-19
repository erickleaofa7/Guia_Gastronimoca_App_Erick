package com.erick.guia_gastronimoca_app.Venezuela.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.erick.guia_gastronimoca_app.controlador.FragmentCosta;
import com.erick.guia_gastronimoca_app.controlador.FragmentSierra;

public class PagerController extends FragmentPagerAdapter {
    int numtab;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numtab = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return  new FragmentCostaVenezuela();
            case 1:
                return new FragmentSierraVen();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numtab;
    }
}
