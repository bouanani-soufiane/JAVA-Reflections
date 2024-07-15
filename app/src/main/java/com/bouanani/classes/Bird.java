package com.bouanani.classes;

public class Bird extends Animal {
    private boolean walks;

    public Bird() {
        super("bird");
    }

    public Bird(String name, boolean walks) {
        super(name);
        setWalks(walks);
    }

    private void setWalks ( boolean walks ) {
    }

    public Bird(String name) {
        super(name);
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
        return "bird";
    }
}
