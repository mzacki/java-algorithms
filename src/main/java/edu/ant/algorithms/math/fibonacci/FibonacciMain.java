package edu.ant.algorithms.math.fibonacci;

import edu.ant.algorithms.utils.logger.LoggingService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matt on 05.11.2018 at 19:27.
 */
public class FibonacciMain {

    static final int N_ELEMENT = 7;

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    // Elements of the sequence will be added to the lists below
    private final List<Integer> list1 = new ArrayList<>();
    private final List<Integer> list2 = new ArrayList<>();

    public void addToFirst(int n) {
        synchronized (lock1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            FibonacciFormula fibonacciFormula = new FibonacciFormula();
            int element = fibonacciFormula.countElement(n);
            list1.add(element);
            LoggingService.logMessage(element);
        }
    }

    public void addToSecond(int n) {
        synchronized (lock2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
            list2.add(fibonacciRecursive.countElement(n));
        }
    }

    // Counts and add to the lists until n element is reached
    public void process() {
        for (int i = 0; i <= N_ELEMENT; i++) {
            addToFirst(i);
            addToSecond(i);
        }
    }

    public void main() {
        Thread thread1 = new Thread(this::process);
        // Thread thread2 = new Thread(() -> process());
        thread1.start();
        // thread2.start();

        try {
            thread1.join();
            // thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        LoggingService.logMessage(list1.toString());
        LoggingService.logMessage(list2.toString());
    }

}
