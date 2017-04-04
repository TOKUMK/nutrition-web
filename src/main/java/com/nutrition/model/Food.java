package com.nutrition.model;

/**
 * Created by jonathan on 19/03/17.
 */
public class Food {

    private String name;

    public Food(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
