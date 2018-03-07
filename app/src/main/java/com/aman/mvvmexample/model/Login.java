package com.aman.mvvmexample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by amandeep on 17/1/18.
 */

public class Login  implements Serializable {

    @SerializedName("username") public String username;

    @SerializedName("password") public String password;

    @SerializedName("salt") public String salt;

    @SerializedName("md5") public String md5;

    @SerializedName("sha1") public String sha1;

    @SerializedName("sha256") public String sha256;


}