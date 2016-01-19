package com.magda.Animals;

import com.magda.Noiseable;

public class Cat extends Pet implements Noiseable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "meow!";
    }
}
