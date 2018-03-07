package com.aman.mvvmexample.network;

import com.aman.mvvmexample.model.UserResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by amandeep on 17/1/18.
 */

public interface UsersService {

    @GET
    Observable<UserResponse> fetchUsers(@Url String url);
}
