package com.aman.mvvmexample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by amandeep on 17/1/18.
 */

public class Location implements Serializable {

    @SerializedName("street") public String street;

    @SerializedName("city") public String city;

    @SerializedName("state") public String state;

    @SerializedName("postcode") public String postcode;

}