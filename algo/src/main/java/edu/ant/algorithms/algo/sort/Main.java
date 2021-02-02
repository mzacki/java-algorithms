package edu.ant.algorithms.algo.sort;

import edu.ant.algorithms.algo.sort.selection.SelectionSort;
import edu.ant.patterns.utils.logger.LoggingService;

public class Main {

    public static void main(String[] args) {
        int[] input = {4, 7, 1, 2, 9, 34, 76, 12, 0};
        SelectionSort selectionSort = new SelectionSort(input);
        LoggingService.logMsg((Object) selectionSort.reverseSort());
    }

}
