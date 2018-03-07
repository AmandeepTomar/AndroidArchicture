package com.aman.mvvmexample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by amandeep on 17/1/18.
 */

public class Picture implements Serializable {

    @SerializedName("large") public String large;

    @SerializedName("medium") public String medium;

    @SerializedName("thumbnail") public String thumbnail;
}