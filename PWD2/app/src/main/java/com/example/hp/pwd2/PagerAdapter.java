package com.example.hp.pwd2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hp on 10/3/18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{

    int mNoOfTabs  = 3;

    private String[] tabtitles = new String[]{"All Courses" , "My Courses"};

    public PagerAdapter(FragmentManager fm){

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
                Tab1 tab1 = new Tab1();
                return tab1;

            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;


            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabtitles.length;
    }
}
