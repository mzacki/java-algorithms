package edu.ant.algorithms.algo.search.tree;

public class Tree {

    private Node root;

    public void add(int item) {
        if (root == null) {
            root = new Node(item);
        } else {
            root.add(item);
        }
    }

}
