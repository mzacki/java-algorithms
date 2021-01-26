package edu.ant.algorithms.algo.search;

import edu.ant.algorithms.algo.search.linear.LinearSearch;
import edu.ant.patterns.utils.logger.LoggingService;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        LinearSearch linearSearch = new LinearSearch(array, 8);
        linearSearch.search();
        LoggingService.logMsg(linearSearch);
    }

}
