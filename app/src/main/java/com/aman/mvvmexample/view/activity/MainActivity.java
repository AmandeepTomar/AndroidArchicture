package com.aman.mvvmexample.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aman.mvvmexample.R;



import com.aman.mvvmexample.databinding.InclideDataBinding;
import com.aman.mvvmexample.model.MainActivityModel;
import com.aman.mvvmexample.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    InclideDataBinding binding;


    MainActivityModel model=new MainActivityModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        model.userFirstName="Amandeep";
        model.userLastName="TOmar";
        model.userAddress="address data is config";
        model.userDesc="not required";
        model.userImage="https://www.reduceimages.com/img/image-after.jpg";
        initializeBinding(model);

     //   setContentView(R.layout.activity_main);
/*        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/


    }

    private void initializeBinding(MainActivityModel model) {
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        MainActivityViewModel niewModel=new MainActivityViewModel(model);
        binding.setMainActivityViewModel(niewModel);





    }



}
