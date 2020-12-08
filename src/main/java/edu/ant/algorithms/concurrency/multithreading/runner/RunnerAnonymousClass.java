package edu.ant.algorithms.concurrency.multithreading.runner;


import edu.ant.algorithms.math.fibonacci.FibonacciRecursive;
import edu.ant.utils.logger.LoggingService;

/**
 * Created by Matt on 04.11.2018 at 19:39.
 */

// Replaced with LAMBDA
public class RunnerAnonymousClass {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
            for (int i = 10; i < 100; i = i+10) {

                LoggingService.logMessage(fibonacciRecursive.countElement(i));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        });

        thread.start();
    }

}
