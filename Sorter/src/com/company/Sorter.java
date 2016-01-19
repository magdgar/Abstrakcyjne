package com.company;

import java.util.List;

public abstract class Sorter<T> {
    //implementation of design pattern Sorter

    private final List<T> list;

    public Sorter(List<T> list) {
        this.list = list;
    }

    public List<T> returnSortedAndFiltered(){
        return sort(filter(list));
    }

    protected abstract List<T> sort(List<T> list);
    protected abstract List<T> filter(List<T> list);
}
