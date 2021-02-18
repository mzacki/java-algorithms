package edu.ant.algorithms.data.structures.queue.recurring;

public class Item implements Recurrable {

    private final int id;
    private boolean recurring;

    public Item(int id) {
        this.id = id;
    }

    public void setRecurring(boolean value) {
        this.recurring = value;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean isReccuring() {
        return recurring;
    }

}
