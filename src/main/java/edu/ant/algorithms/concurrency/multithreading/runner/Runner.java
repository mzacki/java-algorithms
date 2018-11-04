package edu.ant.algorithms.concurrency.multithreading.runner;


/**
 * Created by Matt on 04.11.2018 at 19:24.
 */
public class Runner extends Thread {
    public void run() {
        FibonacciFormula fibo = new FibonacciFormula();
        for (int i = 0; i < 10; i++) {

            System.out.println(fibo.countElement(i));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
