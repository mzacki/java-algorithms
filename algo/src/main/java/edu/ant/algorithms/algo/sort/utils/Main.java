package edu.ant.algorithms.algo.sort.utils;

import edu.ant.patterns.utils.logger.LoggingService;

public class Main {

    public static void main(String[] args) {

        SortCollator sortCollator = new SortCollator(100000, 1000);
        sortCollator.run().forEach(result -> {
            LoggingService.logMsg(result.getName());
            LoggingService.logMsg("t (ms): " + result.getTime());
        });

    }

}
