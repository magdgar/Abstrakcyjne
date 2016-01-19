package com.magda.Animals;

import com.magda.Noiseable;

public class Pig implements Noiseable {
    @Override
    public String makeNoise() {
        return "Oink";
    }
}
