package com.bouanani.classes;

import com.bouanani.interfaces.Locomotion;

public class Goat extends Animal implements Locomotion {
    @Override
    protected String getSound () {
        return "bleat";
    }

    @Override
    public String eats () {
        return "walks";
    }

    @Override
    public String getLocomotion () {
        return "grass";
    }
}
