package com.aman.mvvmexample.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.view.fragment.FragmentBinding;

public class FragmentBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_binding);


        if (getSupportFragmentManager()!=null){
            FragmentBinding fragmentBinding=FragmentBinding.newInstance("","");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentBindingCOn,fragmentBinding)
                    .commit();
        }
    }
}
