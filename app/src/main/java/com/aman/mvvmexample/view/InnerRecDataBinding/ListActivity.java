package com.aman.mvvmexample.view.InnerRecDataBinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.databinding.ListBinding;

public class ListActivity extends AppCompatActivity {
    ListBinding binding;
    ListModel model;
    ListViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_list);

        model=new ListModel();
        viewModel=new ListViewModel(model);
        binding.setViewModel(viewModel);
       // setContentView(R.layout.activity_list);
    }
}
