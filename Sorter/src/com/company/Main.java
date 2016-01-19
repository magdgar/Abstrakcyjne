package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(2,5,9,7,1,6,4,2,0,6,5,60));
        Sorter<Integer> sorter = new IntegerSorter(list);
        System.out.println(sorter.returnSortedAndFiltered().toString());
    }
}
