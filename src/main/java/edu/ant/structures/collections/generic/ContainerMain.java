package edu.ant.structures.collections.generic;

import edu.ant.utils.logger.LoggingService;

public class ContainerMain {

    public static void main(String[] args) {

        Container<String> strContainer = new Container<>("item");
        LoggingService.logMessage(strContainer.getItem());

        Container<Boolean> booleContainer = new Container<>(true);
        LoggingService.logMessage(booleContainer.getItem());

        Container<Long> longContainer = new Container<>(10L);
        LoggingService.logMessage(longContainer.getItem());
    }

}
