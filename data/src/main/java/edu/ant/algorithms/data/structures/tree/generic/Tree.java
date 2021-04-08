package edu.ant.algorithms.data.structures.tree.generic;

public class Tree<K extends Comparable<K>, V> {

    private Node<K, V> root;


    public void insert(K key, V value) {

        Node<K, V> insertedNode = new Node<>(key, value);

        if (root == null) {
            root = insertedNode;
        } else {

            Node<K, V> parent = root;
            boolean inserted = false;

            while (!inserted) {

                if (key.compareTo(parent.getKey()) < 0) {

                    if (parent.getLeftChild() == null) {
                        parent.setLeftChild(insertedNode);
                        inserted = true;
                    } else {
                        parent = parent.getLeftChild();
                    }
                } else {

                    if (parent.getRightChild() == null) {
                        parent.setRightChild(insertedNode);
                        inserted = true;
                    } else {
                        parent = parent.getRightChild();
                    }
                }
            }
        }
    }

    public void insertRecursive(K key, V value) {
        if (root == null) {
            root = new Node<>(key, value);
        } else {
            insertRecursive(root, key, value);
        }
    }

    private void insertRecursive(Node<K, V> node, K key, V value) {
        if (compare(key, node.getKey()) > 0) {
            if (node.getRightChild() == null) {
                node.setRightChild(new Node<>(key, value));
            } else {
                insertRecursive(node.getRightChild(), key, value);
            }
        } else {
            if (node.getLeftChild() == null) {
                node.setLeftChild(new Node<>(key, value));
            } else {
                insertRecursive(node.getLeftChild(), key, value);
            }
        }
    }

    public V get(K key) {
        return get(key, root);
    }

    private V get(K key, Node<K, V> node) {

        if (node == null) return null;

        int result = compare(key, node.getKey());

        if (result == 0) return node.getValue();

        return result > 0 ?
                get(key, node.getRightChild()) :
                get(key, node.getLeftChild());
    }

    private int compare(K firstKey, K secondKey) {
        return firstKey.compareTo(secondKey);
    }

}
