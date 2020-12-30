package edu.ant.algorithms.concurrency.multithreading.runner;


import edu.ant.algorithms.math.fibonacci.FibonacciFormula;
import edu.ant.utils.logger.LoggingService;

/**
 * Created by Matt on 04.11.2018 at 19:31.
 */
public class RunnerInterface implements Runnable {

    public void run() {
        FibonacciFormula fibo = new FibonacciFormula();
        for (int i = 0; i < 10; i++) {

            LoggingService.logMsg(fibo.countElement(i));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
