package com.oop;

import com.oop.phone.AbstractPhone;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone){
        phone.call(number);
    }
}
