package com.magda;

import com.magda.Animals.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mruczus");
        Cat cat2 = new Cat("Fiona");
        Dog dog = new Dog("Brutus");
        Dog dog2 = new Dog("Killer");
        Pig pig = new Pig();
        Cow cow = new Cow();
        Fox fox = new Fox();

        List<Noiseable> list = new LinkedList<>();
        list.addAll(Arrays.asList(cat, cat2, dog, dog2, pig, cow, fox));

        list.forEach(noiseable -> {
            if(noiseable instanceof Pet){
                System.out.println(((Pet) noiseable).getName() + " says " + noiseable.makeNoise());
            }else{
                if(noiseable instanceof Fox) {
                    System.out.println( "\n What does the fox say?!");
                    System.out.println(noiseable.makeNoise());
                }else
                    System.out.println(noiseable.getClass().getSimpleName() + " says " + noiseable.makeNoise());
            }
        });

    }
}
