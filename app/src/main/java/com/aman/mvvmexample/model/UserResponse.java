package com.aman.mvvmexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by amandeep on 17/1/18.
 */

public class UserResponse {


    @SerializedName("results")
    private List<User> userList;

    public List<User> getPeopleList() {
        return userList;
    }

    public void setPeopleList(List<User> mUserList) {
        this.userList = mUserList;
    }


}
