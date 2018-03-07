package com.aman.mvvmexample.view.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.databinding.ActivityUserDetailsBinding;
import com.aman.mvvmexample.databinding.UserActivityBinding;
import com.aman.mvvmexample.model.User;
import com.aman.mvvmexample.viewmodel.UserDetailViewModel;

public class UserDetailsActivity extends AppCompatActivity {
    private static final String EXTRA_USER = "EXTRA_USER";
    private ActivityUserDetailsBinding activityUserDetailsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityUserDetailsBinding= DataBindingUtil.setContentView(this,R.layout.activity_user_details);
//        setSupportActionBar(activityUserDetailsBinding.toolbar);
        displayHomeAsUpEnabled();
        getExtrasFromIntent();
    }
    private void displayHomeAsUpEnabled() {

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static Intent fillDetail(Context context, User user) {
        Intent intent = new Intent(context, UserDetailsActivity.class);
        intent.putExtra(EXTRA_USER, user);
        return intent;
    }

    private void getExtrasFromIntent(){
        User user = (User) getIntent().getSerializableExtra(EXTRA_USER);
        UserDetailViewModel userDetailViewModel = new UserDetailViewModel(user);
       // activityUserDetailBinding.setUserDetailViewModel(userDetailViewModel);
        activityUserDetailsBinding.setUserDetailViewModel(userDetailViewModel);
        setTitle(user.name.title + "." + user.name.first + " " + user.name.last);
    }

}
