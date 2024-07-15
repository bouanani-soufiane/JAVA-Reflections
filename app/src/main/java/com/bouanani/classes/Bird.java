package com.bouanani.classes;

public class Bird extends Animal {
    private boolean walks;

    public Bird() {
        super();
    }

    public Bird ( String name, boolean walks ) {
        super();

    }

    private void setWalks ( boolean walks ) {
    }

    public Bird(String name) {
        super();
    }

    public boolean walks() {
        return walks;
    }


    @Override
    protected String getSound () {
        return "";
    }

    @Override
    public String eats () {
        return "";
    }

    public String getName () {
        return "";
    }
}
