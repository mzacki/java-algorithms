package edu.ant.algorithms.data.structures.tree.integer;

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

    public void remove(int value) {
        root = remove(root, value);
    }

    private Node remove(Node subTreeRoot, int value) {
        if (subTreeRoot == null) {
            return null;
        }

        if (value < subTreeRoot.getItem()) {
            subTreeRoot.setLeftChild(
                    remove(
                            subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getItem()) {
            subTreeRoot.setRightChild(
                    remove(
                            subTreeRoot.getRightChild(), value));
        } else {

            // if node to delete has 0 or 1 child

            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }

            // if node to delete has 2 children

            subTreeRoot.setItem(
                    subTreeRoot.getRightChild().min());

            subTreeRoot.setRightChild(
                    remove(
                            subTreeRoot.getRightChild(),
                            subTreeRoot.getItem()));
        }

        return subTreeRoot;
    }

}
