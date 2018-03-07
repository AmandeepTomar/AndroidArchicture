package com.aman.mvvmexample.network;

import com.aman.mvvmexample.utils.Constant;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.aman.mvvmexample.utils.Constant.BASE_URL;

/**
 * Created by amandeep on 17/1/18.
 */

public class ApiFactory {

    public static UsersService create() {
        HttpLoggingInterceptor.Level logLevel = HttpLoggingInterceptor.Level.BODY;
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(logLevel);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(UsersService.class);
    }

}