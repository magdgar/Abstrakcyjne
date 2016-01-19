package com.magda.Animals;

import com.magda.Noiseable;

public class Dog extends Pet implements Noiseable{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Wow wow!";
    }
}
