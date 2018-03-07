package com.aman.mvvmexample.view.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.aman.mvvmexample.view.fragment.PagerAdapterFragment;
import com.aman.mvvmexample.view.fragment.ViewPagerFragment;

/**
 * Created by amandeep on 18/1/18.
 */

public class ViewpagerAdapter extends FragmentStatePagerAdapter {
    private static final int FirstPAGE=0;
    private static final int SECOUNDPAGE=1;
    private static final int THIRDPAGE=2;
    private static final int FPORTHPAGE=3;
    private static int TAB[]=new int[]{FirstPAGE,SECOUNDPAGE,THIRDPAGE,FPORTHPAGE};
    //private static CharSequence TABNAME[]=new CharSequence[]{'F','SECOUNDPAGE','THIRDPAGE','FPORTHPAGE'};

    private Context context;

    public ViewpagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (TAB[position]){
            case FirstPAGE:
                return ViewPagerFragment.newInstance("yes i am here","");
            case SECOUNDPAGE:
                return ViewPagerFragment.newInstance("yo buddy you are right","");
            case THIRDPAGE:
                return ViewPagerFragment.newInstance("Amandeep tomar","");
            case FPORTHPAGE:
                return ViewPagerFragment.newInstance("abid khan is here!!!","");
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (TAB[position]){
            case FirstPAGE:
                return "Amandeep";
            case SECOUNDPAGE:
                return "abid";
            case THIRDPAGE:
                return "Tomar";
            case FPORTHPAGE:
                return "Khan";
        }
        return null;
    }
}
