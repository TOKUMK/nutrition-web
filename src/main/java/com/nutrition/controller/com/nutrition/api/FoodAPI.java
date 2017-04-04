package com.nutrition.controller.com.nutrition.api;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
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
    Handle the general creation and updates of any food types. how can this be used in conjunction with
    a food service ?
 */
@RestController
public class FoodAPI {

    @RequestMapping(value="/food/{foodName}", method = RequestMethod.GET)
    public boolean getFood(@PathVariable("foodname")String foodName){

        System.out.println("Food name is " + foodName);

        //todo - service.search()-> dao.search()-> hibernate/mongo.search()-> query().

        return true;
    }

    @RequestMapping(value="/food/", method = RequestMethod.PUT)
    public boolean addFood(HttpServletResponse res, HttpServletRequest req){

        //todo: method of doing this with angular vs jsp vs..
        //todo: eg model object used in jsp.

        //req.get();

        return true;
    }

    @RequestMapping(value="/food/{id}", method = RequestMethod.DELETE)
    public boolean deleteFood(@PathVariable("id")int id){
        //todo: id type should be revised depending on persistence strategy.
        System.out.println("food id is " + id);

        return true;
    }


}
