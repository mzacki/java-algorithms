package edu.ant.algorithms.collections.generic;

import edu.ant.algorithms.utils.logger.LoggingService;

public class KeyValuePairMain {

    public static void main(String[] args) {

        KeyValuePair<String, Boolean> booleStrPair = new KeyValuePair<>("isOK", true);

        LoggingService.logMessage("Key: " + booleStrPair.getKey());
        LoggingService.logMessage("Value: " + booleStrPair.getValue());

    }

}