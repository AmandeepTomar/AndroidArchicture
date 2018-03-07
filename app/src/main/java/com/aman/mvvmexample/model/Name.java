package com.aman.mvvmexample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by amandeep on 17/1/18.
 */

public class Name implements Serializable {

    @SerializedName("title") public String title;

    @SerializedName("first") public String first;

    @SerializedName("last") public String last;
}