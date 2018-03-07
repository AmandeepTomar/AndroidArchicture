package com.aman.mvvmexample.view.InnerRecDataBinding;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by amandeep on 3/2/18.
 */

public class SliderAdapter extends FragmentStatePagerAdapter {
    private ListViewModel viewModel;
    public SliderAdapter(FragmentManager fm,ListViewModel viewModel) {
        super(fm);
        this.viewModel=viewModel;
    }

    @Override
    public Fragment getItem(int position) {
        return ImageAdapterItem.newInstance("",viewModel);
    }

    @Override
    public int getCount() {
        return 10;
    }
}
