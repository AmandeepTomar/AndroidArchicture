package com.aman.mvvmexample.viewmodel;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.aman.mvvmexample.model.MainActivityModel;
import com.aman.mvvmexample.view.activity.MainActivity;
import com.aman.mvvmexample.view.activity.UsingBaseObserable;
import com.bumptech.glide.Glide;

/**
 * Created by amandeep on 17/1/18.
 */

public class MainActivityViewModel {
    public MainActivityModel model;

    public MainActivityViewModel(MainActivityModel model) {
        this.model = model;
    }

    public String getFullName() {
        model.fullName = model.userFirstName + " ," + model.userLastName;
        return model.fullName;
    }

    public String getFirstName() {
        return model.userFirstName;
    }

    public String getLastName() {
        return model.userLastName;
    }

    public String getAddress() {
        return model.userAddress;
    }

    public String getUserDesc(){
        return model.userDesc;
    }


    public void fabClick(View v){
        Log.e("yes clicked","fab button clicked");

    }

    @BindingAdapter("myTagImage")
    public static void setMyImage(ImageView imageView,String imgUrl){
        Glide.with(imageView.getContext()).load(imgUrl).into(imageView);
    }

    public String getUserImage(){
        return model.userImage;
    }

    public boolean getisBig(){
        return model.isBig;
    }

    public int getAge(){
        return model.age;
    }

    //Listener Bindings

    public void btnClickData(View v,MainActivityModel model){
        Log.e("btnClick",model.userFirstName);
        Intent intent=new Intent(v.getContext(), UsingBaseObserable.class);
        v.getContext().startActivity(intent);

    }

    public MainActivityModel getModel(){
        return model;
    }

    // this is called method reference
    public void imageViewClick(View view){
        Log.e("image view click",view.getRootView().toString()+" reveived"+view.getId());
    }


    public void onCLickText(View view, MainActivity activity){

    }

}
