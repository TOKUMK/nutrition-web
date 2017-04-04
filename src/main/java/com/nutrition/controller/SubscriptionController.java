package com.nutrition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jonathan on 12/02/17.
 */
@Controller
public class SubscriptionController {


    @RequestMapping(value="/subscribe", method=RequestMethod.POST)
    public String handleSubscription(@RequestParam("email") String email){

        System.out.println("~@:}{+____!£$%^&*()) ++++++ " + email );

        return "test";

    }




}
