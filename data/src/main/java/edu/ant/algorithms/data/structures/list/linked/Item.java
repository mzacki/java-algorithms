package edu.ant.algorithms.data.structures.list.linked;

/**
 * - available since Java 14
 * - compiled to final class
 * - contains:
 * - implicit final fields
 * - implicit all-args constructor
 * - implicit getters
 * - implicitly overriden toString, hashCode and equals
 * */

public record Item(long id, String name) {

    // allowed, accessible from external class
    public static final String INFO = "Example of a record class";

    private static long lastID;

    // instance fields are not allowed:
    // private int counter;

    // default all-arg constructor can be overriden
    // default is no-arg method that must be public
    public Item {
        if (id < 0) {
            throw new IllegalArgumentException();
        }
    }

    // own constructor is allowed but must invoke super() (or rather: this())
    public Item(String name) {
        this(lastID + 1, name);
        lastID++;
    }

    // implicitly:
    // id() - getter for id
    // name() - getter for name

    // own method is allowed
    public long getLastID() {
        return lastID;
    }

    // own toString allowed
    // @Override

}
