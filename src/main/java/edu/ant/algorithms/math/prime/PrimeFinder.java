package edu.ant.algorithms.math.prime;

import edu.ant.utils.logger.LoggingService;

/**
 * Created by Matt on 09.09.2018 at 18:18.
 */
public class PrimeFinder implements Runnable {

    private final long target;
    private long prime;
    private boolean finished = false;
    private Thread runner;

    PrimeFinder(long inTarget) {
        target = inTarget;
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public long getTarget() {
        return target;
    }

    public long getPrime() {
        return prime;
    }

    public boolean isFinished() {
        return finished;
    }

    public static void main(String[] args) {
        LoggingService.logMessage(isPrime(7));
    }

    public void run() {
        long numPrimes = 0;
        long candidate = 2;

        while (numPrimes < target) {
            if (isPrime(candidate)) {
                numPrimes++;
                prime = candidate;
            }
            candidate++;
        }
        finished = true;
    }

    static boolean isPrime(long checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

}
