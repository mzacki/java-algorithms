package edu.ant.algorithms.data.structures.tree;

import edu.ant.patterns.utils.logger.LoggingService;

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

    /**
     *  Implemented: in-order traversal
     *  - ensures natural order
     *  - visits left child, root, right child and so on
     *  other traversals:
     *  - level - visits nodes level by level from left to right
     *  - pre-order - first of all visits root of every subtree
     *  - post-order - last visits root of every subtree
     * */

    public void visit() {
        if (leftChild != null) {
            leftChild.visit();
        }
        LoggingService.logMsg(item);
        if (rightChild != null) {
            rightChild.visit();
        }
    }

}
