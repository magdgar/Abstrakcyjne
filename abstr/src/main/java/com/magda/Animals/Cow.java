package com.magda.Animals;

import com.magda.Noiseable;

public class Cow implements Noiseable{

    @Override
    public String makeNoise() {
        return "Moooow";
    }
}
