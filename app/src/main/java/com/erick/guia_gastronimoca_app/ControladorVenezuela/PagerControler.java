package com.erick.guia_gastronimoca_app.ControladorVenezuela;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class PagerControler extends FragmentPagerAdapter {
    int tabsVenezuela;

    public PagerControler(@NonNull FragmentManager fm, int behavior   ) {
        super(fm, behavior);
        this.tabsVenezuela = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CostaVenezuela();

            case 1:
                return  new SierraVenezuela();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabsVenezuela;

    }
}
