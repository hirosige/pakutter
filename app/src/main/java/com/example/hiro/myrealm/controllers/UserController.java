package com.example.hiro.myrealm.controllers;

import com.example.hiro.myrealm.User;
import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Created by hiro on 2017/12/31.
 */

public class UserController {
    public String toString() {
        return "hello from controller";
    }

    public RealmResults<User> index() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<User> query = realm.where(User.class);
        return query.findAll();
    }

    public void create() {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
            User user = realm.createObject(User.class);
            user.setName("hiroshige");
            user.setAge(33);
        realm.commitTransaction();
    }
}
