package edu.ant.algorithms.concurrency.multithreading;

import edu.ant.utils.logger.LoggingService;

public class MainThreadExample {

    private static final long SLEEP = 5000;

    public static void main(String[] args) {

        LoggingService.logMsg("Starting main thread....");
        LoggingService.logMsg("Main thread wrote this. Please wait " + SLEEP/1000 + " seconds");

        // Example of use - static Thread.sleep method
        // One, main thread of application is waiting for given time

        try {
            LoggingService.getLogger().info("Thread falls asleep...");
            Thread.sleep(SLEEP);
        } catch (InterruptedException e) {
            // Exception should be logged or rethrown
            // Thread should be interrupted
            LoggingService.getLogger().error(e.getMessage());
            Thread.currentThread().interrupt();
        }

        LoggingService.logMsg("After thread sleep: Main thread wrote this.");
    }

}
