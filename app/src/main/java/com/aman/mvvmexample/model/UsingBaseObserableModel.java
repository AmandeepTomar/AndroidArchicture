package com.aman.mvvmexample.model;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;

import com.aman.mvvmexample.view.activity.FragmentBindingActivity;

/**
 * Created by amandeep on 18/1/18.
 */

public class UsingBaseObserableModel extends BaseObservable {
    private String userName, userEmail, userAddress;
    private boolean isonline;
    private String editTextDetails;

    public UsingBaseObserableModel(String userName, String userEmail, String userAddress, boolean isonline,String editTextDetails) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.isonline = isonline;
        this.editTextDetails=editTextDetails;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyChange();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        notifyChange();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        notifyChange();
    }

    public boolean isIsonline() {
        return isonline;
    }

    public void setIsonline(boolean isonline) {
        this.isonline = isonline;
        notifyChange();
    }


    public void onButtonClick1(boolean status) {
        Log.e("staus is ", status + " jkhjkhjkhjkhjkhjkh");
        setIsonline(status);
        Log.e("staus is ", status + "");
    }

    public String getEditTextDetails() {
        return editTextDetails;
    }

    public void setEditTextDetails(String editTextDetails) {
        this.editTextDetails = editTextDetails;
        notifyChange();
    }

    public void onButtonFragmentBinding(View view){
        Intent intent=new Intent(view.getContext(), FragmentBindingActivity.class);
        view.getContext().startActivity(intent);
    }
}
