package com.aman.mvvmexample.viewmodel;

import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.aman.mvvmexample.view.activity.FragmentBindingActivity;
import com.aman.mvvmexample.view.adapter.ViewpagerAdapter;

/**
 * Created by amandeep on 18/1/18.
 */

public class PagerAdapterViewModel {


    @BindingAdapter("pagerAdapter")
    public static void bindViewPagerAdapter(ViewPager viewPager, FragmentBindingActivity activity){
        ViewpagerAdapter adapter=new ViewpagerAdapter(activity.getSupportFragmentManager(),activity);
        viewPager.setAdapter(adapter);
    }

    @BindingAdapter("tabLayout")
    public static void bindViewpagerTabs(final TabLayout tabLayout,final ViewPager viewPager){
        tabLayout.setupWithViewPager(viewPager,true);

    }
}
