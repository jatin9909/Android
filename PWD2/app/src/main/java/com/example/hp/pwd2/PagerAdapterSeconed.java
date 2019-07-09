package com.example.hp.pwd2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hp on 17/3/18.
 */

public class PagerAdapterSeconed extends FragmentStatePagerAdapter {

    int mNoOfTabs  = 3;

    private String[] tabtitles = new String[]{"Employment By Role" , "Employment By Location" , "Recommended Employement"};

    public PagerAdapterSeconed(FragmentManager fm) {

        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position){
        return tabtitles[position];
    }


    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                Tab4 tab4 = new Tab4();
                return tab4;

            case 1:
                Tab5 tab5 = new Tab5();
                return tab5;

            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabtitles.length;
    }
}
