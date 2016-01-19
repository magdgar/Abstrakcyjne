package com.magda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> list;
	    Czarodziej czarodziej = new Czarodziej();
        Elf elf = new Elf();
        Barlog barlog = new Barlog();
        Ork ork = new Ork();
        Ork ork1 = new Ork();
        Ork ork2 = new Ork();
        Czlowiek czlowiek = new Czlowiek();

        list = new LinkedList<>(Arrays.asList(czarodziej, elf, barlog, ork, czlowiek));

        System.out.println(list);
        System.out.println(ork.fight(list));
    }
}
