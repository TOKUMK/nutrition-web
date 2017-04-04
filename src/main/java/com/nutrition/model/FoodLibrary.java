package com.nutrition.model;

import java.util.List;

/**
 * Created by jonathan on 21/03/17.
 *
 * FoodLibrary is a simple wrapper class for foods. Essentially it manages
 * the association between each user and the foods they have personally used
 * and added to the system.
 *
 * In this respect user has fast playback with foods they use on a frequent basis.
 *
 * TODO: this will eventually spawn a 'FoodPantry' class, as the application evolves.
 *
 * TODO: consider - would this primarily be a serice based component?
 *
 *
 */
public class FoodLibrary {

    private String userId;
    private List<Food> foodLib;


}
