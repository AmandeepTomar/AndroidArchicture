package com.aman.mvvmexample.viewmodel;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.model.FragmentActivityModel;
import com.aman.mvvmexample.model.FragmentBindingModel;
import com.aman.mvvmexample.view.activity.FragmentBindingActivity;
import com.aman.mvvmexample.view.fragment.PagerAdapterFragment;
import com.aman.mvvmexample.view.fragment.ViewPagerFragment;

/**
 * Created by amandeep on 18/1/18.
 */

public class FragmentBindingViewModel {
    FragmentBindingModel model;

    public FragmentBindingViewModel(FragmentBindingModel model) {
        this.model = model;
    }

    public String getText(){
        return model.getText();
    }

    public void onButtonClick(View view, FragmentBindingViewModel viewModel, FragmentBindingActivity activity){
        Log.e("test data",viewModel.getText()+" received");
        PagerAdapterFragment fragment=PagerAdapterFragment.newInstance("","");
        activity.getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentBindingCOn,fragment)
                .commit();


    }
}
