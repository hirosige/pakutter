package com.example.hiro.myrealm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.hiro.myrealm.controllers.UserController;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(this);
        UserController userController = new UserController();

        userController.create();

        RealmResults<User> results = userController.index();
        Log.v("results", results.toString());
    }
}
