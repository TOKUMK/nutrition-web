package com.nutrition.controller.com.nutrition.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonathan on 25/02/17.
 */

/*
    Handle the general creation and updates of any food types. how can this be used in conjunction with
    a food service ?
 */
@RestController
public class FoodAPI {

    @RequestMapping(value="/food/", method = RequestMethod.GET)
    public boolean getFood(){
        return true;
    }

    @RequestMapping(value="/food/", method = RequestMethod.PUT)
    public boolean addFood(){
        return true;
    }

    @RequestMapping(value="/food/", method = RequestMethod.DELETE)
    public boolean deleteFood(){
        return true;
    }


}
