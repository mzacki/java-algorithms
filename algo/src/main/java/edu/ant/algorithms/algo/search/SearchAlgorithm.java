package edu.ant.algorithms.algo.search;

import java.util.Arrays;

public abstract class SearchAlgorithm {

    private final int[] input;
    private final int target;
    private int indexOfFound;
    private int step;

    protected SearchAlgorithm(int[] input, int target) {
        this.input = input;
        this.target = target;
        this.indexOfFound = -1;
        this.step = 0;
    }

    public int[] getInput() {
        return input;
    }

    public int getTarget() {
        return target;
    }

    public int getIndexOfFound() {
        return indexOfFound;
    }

    public int getStep() {
        return step;
    }

    protected void setIndexOfFound(int indexOfFound) {
        this.indexOfFound = indexOfFound;
    }

    protected void setStep(int step) {
        this.step = step;
    }

    public abstract int search();

    public abstract long maxStep();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchAlgorithm{");
        sb.append("input=").append(Arrays.toString(input));
        sb.append(", target=").append(target);
        sb.append(", indexOfFound=").append(indexOfFound);
        sb.append(", step=").append(step);
        sb.append('}');
        return sb.toString();
    }
}
