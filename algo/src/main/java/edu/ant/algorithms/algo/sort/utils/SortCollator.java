package edu.ant.algorithms.algo.sort.utils;

import edu.ant.algorithms.algo.sort.Sorter;
import edu.ant.algorithms.algo.sort.bubble.BubbleSort;
import edu.ant.algorithms.algo.sort.bubble.BubbleSort2;
import edu.ant.algorithms.algo.sort.bubble.BubbleSort3;
import edu.ant.algorithms.algo.sort.insertion.InsertionSort;
import edu.ant.algorithms.algo.sort.insertion.InsertionSort2;
import edu.ant.algorithms.algo.sort.insertion.InsertionSort3;
import edu.ant.algorithms.algo.sort.merge.MergeSort;
import edu.ant.algorithms.algo.sort.merge.MergeSort2;
import edu.ant.algorithms.algo.sort.merge.MergeSort3;
import edu.ant.algorithms.algo.sort.selection.SelectionSort;
import edu.ant.algorithms.algo.sort.selection.SelectionSort2;
import edu.ant.algorithms.algo.sort.selection.SelectionSort3;
import edu.ant.algorithms.algo.sort.shell.ShellSort;
import edu.ant.algorithms.algo.sort.shell.ShellSortKnuthSequence;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortCollator {

    private final List<Sorter> sorters;
    private final int[] input;

    public SortCollator(int items, int range) {
        this.input = SorterUtils.generateInput(items, range);
        this.sorters = addSorters();
    }

    private List<Sorter> addSorters() {
        List<Sorter> list = new ArrayList<>();
        list.add(new BubbleSort(input));
        list.add(new BubbleSort2(input));
        list.add(new BubbleSort3(input));
        list.add(new InsertionSort(input));
        list.add(new InsertionSort2(input));
        list.add(new InsertionSort3(input));
        list.add(new SelectionSort(input));
        list.add(new SelectionSort2(input));
        list.add(new SelectionSort3(input));
        list.add(new ShellSort(input));
        list.add(new ShellSortKnuthSequence(input));
        list.add(new MergeSort(input));
        list.add(new MergeSort2(input));
        list.add(new MergeSort3(input));
        return list;
    }

    public List<Result> run() {
        List<Result> results = new ArrayList<>();
        for (Sorter s : sorters) {
            results.add(new Result(SorterUtils.getName(s), SorterUtils.getTime(s)));
        }
        return results
                .stream()
                .sorted(Comparator.comparingLong(Result::getTime))
                .collect(Collectors.toList());
    }

    static class Result {

        private final String name;
        private final long time;

        public Result(String name, long time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public long getTime() {
            return time;
        }

    }

}
