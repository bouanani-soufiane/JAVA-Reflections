package com.bouanani.classes;

import com.bouanani.interfaces.Eating;

public abstract class Animal implements Eating {
    public static String CATEGORY = "DOMESTIC";
    private String name;

    public Animal ( String bird ) {
    }

    protected abstract String getSound ();

}
