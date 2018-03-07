package com.aman.mvvmexample.model;

/**
 * Created by amandeep on 18/1/18.
 */

public class ViewPagerFragmentModel {
    private String titileText;

    public ViewPagerFragmentModel(String titileText) {
        this.titileText = titileText;
    }

    public String getTitileText() {
        return titileText;
    }

    public void setTitileText(String titileText) {
        this.titileText = titileText;
    }
}
