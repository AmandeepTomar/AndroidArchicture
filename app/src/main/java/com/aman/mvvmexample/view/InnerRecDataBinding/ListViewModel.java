package com.aman.mvvmexample.view.InnerRecDataBinding;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.Serializable;

/**
 * Created by amandeep on 3/2/18.
 */

public class ListViewModel extends BaseObservable implements Serializable {
    public ListModel model;

    public ListViewModel(ListModel model) {
        this.model = model;
    }


    @BindingAdapter("RevMainAdapter")
    public static void RevMainAdapter(RecyclerView recyclerView,ListViewModel viewModel){
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        RvMainAdapter adapter=new RvMainAdapter(recyclerView.getContext(),viewModel);
        recyclerView.setAdapter(adapter);

    }

    // for sub pager
        @BindingAdapter("ImageItemAdapter")
        public static void ImageItemAdapter(ViewPager pager,ListViewModel model){

        SliderAdapter adapter=new SliderAdapter(((ListActivity)pager.getContext()).getSupportFragmentManager(),model);
            pager.setClipToPadding(false);
            pager.setPadding(170, 0, 170, 0);
            pager.setPageMargin(25);
            pager.setAdapter(adapter);
            pager.setCurrentItem(1);
        }


    // sub sub - sub
        @BindingAdapter("InnerSubAdapter")
    public static void InnerSubAdapter(RecyclerView recyclerView,ListViewModel viewModel){
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
            recyclerView.setHasFixedSize(true);
            RvListSubAdapter adapter=new RvListSubAdapter(recyclerView.getContext(),viewModel);
            recyclerView.setAdapter(adapter);

        }



}
