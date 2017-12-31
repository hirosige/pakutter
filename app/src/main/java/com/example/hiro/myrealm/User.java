package com.example.hiro.myrealm;

import io.realm.RealmObject;

/**
 * Created by hiro on 2017/12/31.
 */

public class User extends RealmObject {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
