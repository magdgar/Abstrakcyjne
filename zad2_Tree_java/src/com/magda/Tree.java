package com.magda;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Predicate;

public class Tree<T> {
    private ArrayList<T> elementsTypeList;
    private ArrayList<Tree> treesList;
    private final EnumeratorOrder order;
    private Class type;
    private ArrayList elements;
    private static String output;

    public Tree(T value, EnumeratorOrder order, Class type){
        this.order = order;
        this.type = type;

        elements = new ArrayList();
        elements.add(value);
        elementsTypeList = new ArrayList<>();
        treesList = new ArrayList<>();
    }

    public Tree(T value, EnumeratorOrder order, final List<Object> initialElements, Class type){
        this.order = order;
        this.type = type;

        elements = new ArrayList();
        elements.add(value);
        elements.addAll(initialElements);

        elementsTypeList = new ArrayList<>();
        treesList = new ArrayList<>();

        initialElements.stream().filter(isTypeOfT()).forEach((element) -> add((T) element));
        initialElements.stream().filter(isTypeOfTree()).forEach((element) -> add((Tree) element));
    }

    public void add(Tree child){
        treesList.add(child);
    }

    public void add(T child){
        elementsTypeList.add(child);
    }

    public String display(){
        output = "";
        switch (order){
            case DepthFirstSearch:
                return dfs();
            case BreadthFirstSearch:
                return bfs();
        }
        return "";
    }

    private String dfs(){
        for(Object element: elements)
            if(element instanceof Tree)
                ((Tree) element).dfs();
            else
                output += element + ", ";
        return output;
    }

    private String bfs(){
        String output = "";
        Queue<Tree> queue = new LinkedBlockingQueue<>();
        for(Object element: elements)
            if(element instanceof Tree)
                queue.add((Tree) element);
            else
                output = output + element + ", ";
        while (!queue.isEmpty()){
            Tree tree = queue.poll();
            for(Object element: tree.getChildren())
                if(element instanceof Tree)
                    queue.add((Tree) element);
                else
                    output = output + element + ", ";
        }
        return output;
    }

    public ArrayList<T> getChildren(){
        return elements;
    }

    public ArrayList<Tree> getTreesList(){
        return treesList;
    }

    private Predicate isTypeOfT(){
        return o -> type.isInstance(o) ;
    }

    private Predicate isTypeOfTree(){
        return o -> o instanceof Tree;
    }
}