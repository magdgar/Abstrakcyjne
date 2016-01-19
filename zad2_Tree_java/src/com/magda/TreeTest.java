package com.magda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by magdgar on 2016-01-19.
 */
public class TreeTest {
    private Tree<Integer> rootTree;
    private Tree<Double> subTree;
    private Tree<Character> subTree2;
    private Tree<String> subsubTree;

    @Before
    public void setUp() throws Exception {
        subsubTree = new Tree<String>("Text", EnumeratorOrder.BreadthFirstSearch, Arrays.asList("ASD", "DSA"), String.class);
        subTree = new Tree<Double>(2.0d, EnumeratorOrder.DepthFirstSearch, Arrays.asList(10.0d, subsubTree, 5.2d), Double.class);
        subTree2 = new Tree<Character>('s', EnumeratorOrder.DepthFirstSearch, Arrays.asList('a', 'b', 'c'), Character.class);
    }

    @Test
    public void shouldPerformDFS() throws Exception {
        rootTree = new Tree<Integer>(0, EnumeratorOrder.DepthFirstSearch, Arrays.asList(1, subTree, subTree2, 4), Integer.class);
        String dfs = "0, 1, 2.0, 10.0, Text, ASD, DSA, 5.2, s, a, b, c, 4, ";
        String maybeDFS = rootTree.display();

        Assert.assertEquals(dfs, maybeDFS);

    }

    @Test
    public void shouldPerformBFS() throws Exception {
        rootTree = new Tree<Integer>(0, EnumeratorOrder.BreadthFirstSearch, Arrays.asList(1, subTree, subTree2, 4), Integer.class);
        String bfs = "0, 1, 4, 2.0, 10.0, 5.2, s, a, b, c, Text, ASD, DSA, ";
        String maybeBFS = rootTree.display();

        Assert.assertEquals(bfs, maybeBFS);
    }

    @Test
    public void shouldPerformSubTreeShowElements() throws Exception{
        rootTree = new Tree<Integer>(0, EnumeratorOrder.BreadthFirstSearch, Arrays.asList(1, subTree, subTree2, 4), Integer.class);
        Tree subtree = rootTree.getTreesList().get(0);
        Tree subtree2 = rootTree.getTreesList().get(1);

        String subdfs = "2.0, 10.0, Text, ASD, DSA, 5.2, ";
        String maybeSubDFS = subtree.display();
        String subdfs2 = "s, a, b, c, ";
        String maybeSubDFS2 = subtree2.display();

        Assert.assertEquals(subdfs, maybeSubDFS);
        Assert.assertEquals(subdfs2, maybeSubDFS2);
    }
}