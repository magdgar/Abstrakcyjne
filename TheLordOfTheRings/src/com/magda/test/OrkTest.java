package com.magda.test;

import com.magda.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by magdgar on 2016-01-18.
 */
public class OrkTest {
    private List<Object> list;
    private Czlowiek czlowiek;
    private Ork ork;
    private Elf elf;

    @org.junit.Before
    public void setUp() throws Exception {
        Czarodziej czarodziej = new Czarodziej();
        elf = new Elf();
        Barlog barlog = new Barlog();
        ork = new Ork();
        czlowiek = new Czlowiek();
        list = new LinkedList<>(Arrays.asList(czarodziej, elf, barlog, ork, czlowiek));
    }
    @Test
    public void testFight() throws Exception {
        Assert.assertEquals(list.size(), 5);
        ork.fight(list);
        Assert.assertEquals(list.size(), 3);
        Assert.assertTrue(list.contains(ork));
        Assert.assertFalse(list.contains(czlowiek));
        Assert.assertFalse(list.contains(elf));
    }
}