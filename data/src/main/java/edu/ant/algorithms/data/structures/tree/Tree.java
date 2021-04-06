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

    public Node get(int item) {
        return root != null ?
                root.get(item) : null;
    }


    public int min() {
        return root == null ?
                Integer.MIN_VALUE : root.min();
    }

    public int max() {
        return root == null ?
                Integer.MAX_VALUE : root.max();
    }

}
