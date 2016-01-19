package com.magda.test;

import com.magda.*;
import org.junit.Assert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by magdgar on 2016-01-18.
 */
public class CzarodziejTest {
    private List<Object> list;
    private Czarodziej czarodziej;

    @org.junit.Before
    public void setUp() throws Exception {
        czarodziej = new Czarodziej();
        Elf elf = new Elf();
        Barlog barlog = new Barlog();
        Ork ork = new Ork();
        Czlowiek czlowiek = new Czlowiek();
        list = new LinkedList<>(Arrays.asList(czarodziej, elf, barlog, ork, czlowiek));
    }

    @org.junit.Test
    public void testFight() throws Exception {
        Assert.assertEquals(list.size(), 5);
        czarodziej.fight(list);
        Assert.assertEquals(list.size(), 4);
    }
}