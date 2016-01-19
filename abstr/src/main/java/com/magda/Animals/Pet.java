package com.magda.Animals;

public abstract class Pet {
    protected final String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
