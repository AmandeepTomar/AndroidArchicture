package com.aman.mvvmexample.viewmodel;

import android.view.View;

import com.aman.mvvmexample.model.FragmentActivityModel;

/**
 * Created by amandeep on 18/1/18.
 */

public class FragmentActivityViewModel {
    FragmentActivityModel model;
    public FragmentActivityViewModel(FragmentActivityModel model) {
        this.model=model;
    }

    private String getText(){
        return model.text;
    }

    private void clickOnFragment(View view){

    }

}
