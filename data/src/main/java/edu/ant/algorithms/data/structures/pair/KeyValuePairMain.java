package edu.ant.algorithms.data.structures.pair;

import edu.ant.patterns.utils.logger.LoggingService;

public class KeyValuePairMain {

    public static void main(String[] args) {

        KeyValuePair<String, Boolean> booleStrPair = new KeyValuePair<>("isOK", true);

        LoggingService.logMsg("Key: " + booleStrPair.getKey());
        LoggingService.logMsg("Value: " + booleStrPair.getValue());

    }

}
