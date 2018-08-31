package edu.ant.algorithms.concurrency.streams;

import edu.ant.algorithms.utils.logger.LoggingService;

@FunctionalInterface
public interface CustomFunctional {

    void display(Object... args);

    // event fuctional interface can still have default, already definied method
    default void displayError(Exception e) {
        LoggingService.getLogger()
                .error(e.getMessage());
    }

}
