package com.example.adam.signupform;

import java.io.Serializable;

/**
 * User class for name and password
 * Created by adam on 7/16/15.
 */
public class User implements Serializable {

    private String mUsername;
    private String mPassword;

    User(String username, String password) {
        this.mUsername = username;
        this.mPassword = password;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }
}
