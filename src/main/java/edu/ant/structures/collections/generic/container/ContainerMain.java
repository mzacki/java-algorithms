package edu.ant.structures.collections.generic.container;

import edu.ant.utils.logger.LoggingService;

public class ContainerMain {

    public static void main(String[] args) {

        Container<String> strContainer = new Container<>("item");
        LoggingService.logMsg(strContainer.getItem());

        Container<Boolean> booleContainer = new Container<>(true);
        LoggingService.logMsg(booleContainer.getItem());

        Container<Long> longContainer = new Container<>(10L);
        LoggingService.logMsg(longContainer.getItem());
    }

}
