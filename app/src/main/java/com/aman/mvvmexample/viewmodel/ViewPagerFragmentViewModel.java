package com.aman.mvvmexample.viewmodel;

import com.aman.mvvmexample.model.ViewPagerFragmentModel;

/**
 * Created by amandeep on 18/1/18.
 */

public class ViewPagerFragmentViewModel {

    ViewPagerFragmentModel model;

    public ViewPagerFragmentViewModel(ViewPagerFragmentModel model) {
        this.model = model;
    }

    public String getTitle(){
        return model.getTitileText();
    }

}
