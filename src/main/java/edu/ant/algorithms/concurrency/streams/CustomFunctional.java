package edu.ant.algorithms.concurrency.streams;

import edu.ant.utils.logger.LoggingService;

@FunctionalInterface
public interface CustomFunctional {

    void display(Object... args);

    // even fuctional interface can still have default, already definied method
    default void displayError(Exception e) {
        LoggingService.getLogger()
                .error(e.getMessage());
    }

}
