package com.company;

import java.util.*;

public class IntegerSorter extends Sorter<Integer> {
    public IntegerSorter(List<Integer> list) {
        super(list);
    }

    @Override
    protected List<Integer> sort(List<Integer> list) {
        //boobleSort coz on 3rd year of it study i cant do any better
        for(int i =0; i<list.size(); i++)
            for (int j = i; j < list.size(); j++) {
                if(list.get(i) > list.get(j))
                    Collections.swap(list, i, j);
            }
        return list;
    }

    @Override
    protected List<Integer> filter(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        return new LinkedList<>(set);
    }
}
