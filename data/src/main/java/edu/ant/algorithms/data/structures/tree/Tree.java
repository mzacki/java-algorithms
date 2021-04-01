package edu.ant.algorithms.data.structures.tree;

public class Tree {

    private Node root;

    public void add(int item) {
        if (root == null) {
            root = new Node(item);
        } else {
            root.add(item);
        }
    }

    // in-order traversal
    public void visit() {
        if (root != null) {
            root.visit();
        }
    }


}
