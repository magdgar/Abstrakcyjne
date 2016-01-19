package com.magda;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by magdgar on 2016-01-18.
 */
public class ElfTest {
    private List<Object> list;
    private Elf elf;
    private Ork ork;
    private Ork ork1;
    private Ork ork2;

    @org.junit.Before
    public void setUp() throws Exception {
        elf = new Elf();
        Barlog barlog = new Barlog();
        ork = new Ork();
        ork1 = new Ork();
        ork2 = new Ork();

        list = new LinkedList<>(Arrays.asList(elf, barlog, ork, ork1, ork2));
    }
    @Test
    public void testFight() throws Exception {
        Assert.assertEquals(list.size(), 5);
        elf.fight(list);
        Assert.assertEquals(list.size(), 2);
        Assert.assertTrue(list.contains(elf));
        Assert.assertFalse(list.contains(ork));
        Assert.assertFalse(list.contains(ork1));
        Assert.assertFalse(list.contains(ork2));
    }
}