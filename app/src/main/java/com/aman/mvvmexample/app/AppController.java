package com.aman.mvvmexample.app;

import android.app.Application;
import android.content.Context;

import com.aman.mvvmexample.network.ApiFactory;
import com.aman.mvvmexample.network.UsersService;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by amandeep on 17/1/18.
 */

public class AppController extends Application {
    private UsersService usersService;
    private Scheduler scheduler;

    private static AppController get(Context context){
        return (AppController) context.getApplicationContext();
    }

    public static AppController create(Context context) {
        return AppController.get(context);
    }

    public UsersService getUsersService(){
        if (usersService==null){
            usersService= ApiFactory.create();
        }
        return usersService;
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) {
            scheduler = Schedulers.io();
        }
        return scheduler;
    }

    public void setUserService(UsersService usersService) {
        this.usersService = usersService;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

}
