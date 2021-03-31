package edu.ant.algorithms.algo.search.tree;

public class Node {

    private final int item;
    private Node leftChild;
    private Node rightChild;

    public Node(int item) {
        this.item = item;
    }

    public void add(int value) {
        // implementation does not support duplicate values
        if (value == item) {
            return;
        }
        // values lower than parent go to the left side of a node
        if (value < item) {
            if (leftChild == null) {
                leftChild = new Node(value);
            } else {
                leftChild.add(value);
            }
        } else {
            // higher values to the right
            if (rightChild == null) {
                rightChild = new Node(value);
            } else {
                rightChild.add(value);
            }
        }
    }

}
