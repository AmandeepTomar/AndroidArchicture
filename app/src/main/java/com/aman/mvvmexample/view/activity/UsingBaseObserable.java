package com.aman.mvvmexample.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.databinding.ActivityUsingBaseObserableBinding;
import com.aman.mvvmexample.model.UsingBaseObserableModel;

public class UsingBaseObserable extends AppCompatActivity {

    ActivityUsingBaseObserableBinding binding;
    UsingBaseObserableModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialBinding();
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(binding.toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    private void initialBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_using_base_obserable);
        model = new UsingBaseObserableModel("AMandeep", "aman@gmail.com", "not defined", true,"yep details ");
        binding.setBaseObserable(model);
        binding.setActivity(this);
    }


    public void onButtonClick(boolean status) {
        Log.e("staus is ",status+" jkhjkhjkhjkhjkhjkh");
        model.setIsonline(status);
        Log.e("staus is ",status+"");
    }



}
