package com.aman.mvvmexample.view.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.databinding.UserActivityBinding;
import com.aman.mvvmexample.utils.Constant;
import com.aman.mvvmexample.view.adapter.UserAdapter;
import com.aman.mvvmexample.viewmodel.UserViewModel;

import java.util.Observable;
import java.util.Observer;

public class UserActivity extends AppCompatActivity implements Observer {
    UserActivityBinding userActivityBinding;
    UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        //setSupportActionBar(userActivityBinding.toolbar);
        setUpListOfUsersView(userActivityBinding.listUser);
        setUpObserver(userViewModel);

    }

    private void setUpObserver(Observable observable) {
        observable.addObserver(this);
    }

    private void setUpListOfUsersView(RecyclerView listUser) {
        UserAdapter userAdapter=new UserAdapter();
        listUser.setAdapter(userAdapter);
        listUser.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initDataBinding() {
        userActivityBinding = DataBindingUtil.setContentView(this, R.layout.user_activity);
        userViewModel = new UserViewModel(this);
        userActivityBinding.setUserViewModel(userViewModel);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof UserViewModel) {
            UserAdapter userAdapter = (UserAdapter) userActivityBinding.listUser.getAdapter();
            UserViewModel userViewModel = (UserViewModel) o;
            userAdapter.setUserList(userViewModel.getUserList());
        }
    }

    private void startActivityActionView() {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Constant.PROJECT_URL)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_github) {
            startActivityActionView();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        userViewModel.reset();
    }
}



