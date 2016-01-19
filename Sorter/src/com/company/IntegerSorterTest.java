package com.company;
import org.junit.Assert;
import java.util.*;

public class IntegerSorterTest {
    List<Integer> list;
    public IntegerSorter integerSorter;

    @org.junit.Before
    public void setUp() throws Exception {
        list = new LinkedList<>(Arrays.asList(2,8,5,6,9,2));
        integerSorter = new IntegerSorter(list);
    }

    @org.junit.Test
    public void testSort() throws Exception {
        integerSorter.sort(list);
        List<Integer> compareList = Arrays.asList(2,8,5,6,9,2);
        Collections.sort(compareList);
        Assert.assertTrue(list.equals(compareList));
    }

    @org.junit.Test
    public void testFilter() throws Exception {
        List<Integer> newList  = integerSorter.filter(list);
        List<Integer> compareList = Arrays.asList(2,5,6,8,9);

        System.out.println(newList);
        System.out.println(compareList);
        Assert.assertTrue(newList.equals(compareList));
    }
}