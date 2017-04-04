package com.nutrition.controller.com.nutrition.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonathan on 25/02/17.
 */


/*
*  Handle general registration, updates and removal of user accounts.
*
*
* */
@RestController
public class UserAPI {

    // check user name against datebase.

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public boolean isRegisteredUser(String name){
        return false;
    }

    @RequestMapping(value="/user/", method = RequestMethod.GET)
    public String getUser(){
        return "usertest";
    }

    @RequestMapping(value="/user/", method = RequestMethod.POST)
    public boolean addUser(String user){
        return true;
    }

    @RequestMapping(value="/user/", method = RequestMethod.PATCH)
    public String updateUser(String user){
        String u = user;
        return u;
    }

    @RequestMapping(value="/user/", method = RequestMethod.DELETE)
    public boolean deleteUser(){
        return true;
    }



}
