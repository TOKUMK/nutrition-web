package com.nutrition.controller.com.nutrition.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping(value="/user/{username}", method = RequestMethod.GET)
    public boolean isRegisteredUser(@PathVariable("username")String username){

        System.out.println("this is username " + username);
        return false;
    }

    @RequestMapping(value="/user/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable("id") int id){
        System.out.println("user id is " + id);

        return "usertest";
    }

    @RequestMapping(value="/user/", method = RequestMethod.POST)
    public boolean addUser(HttpServletRequest req, HttpServletResponse res){

        //req.get()..

        return true;
    }

    @RequestMapping(value="/user/", method = RequestMethod.PATCH)
    public String updateUser(HttpServletRequest req, HttpServletResponse res){

        //todo: patch update user object model

        return u;
    }

    @RequestMapping(value="/user/{id}", method = RequestMethod.DELETE)
    public boolean deleteUser(@PathVariable("id") int id){
        
        return true;
    }



}
