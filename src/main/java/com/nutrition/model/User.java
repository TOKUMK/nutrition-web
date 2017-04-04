package com.nutrition.model;

/**
 * Created by jonathan on 19/03/17.
 */
public class User {

    private String username, password;
    private String firstname, lastname, dob;

    public User(String username){
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
