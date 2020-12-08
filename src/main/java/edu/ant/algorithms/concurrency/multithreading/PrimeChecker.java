package edu.ant.algorithms.concurrency.multithreading;

import edu.ant.algorithms.math.prime.BruteForcePrimeChecker;
import edu.ant.utils.logger.LoggingService;

public class PrimeChecker implements Runnable {

    private static final String PRIME = "PRIME";
    private static final String COMPOSITE = "COMPOSITE";
    private final long n;
    private final long pause;

    public PrimeChecker(long nLimit, long pause) {
        this.n = nLimit;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                LoggingService.getLogger().error(e.getMessage());
                Thread.currentThread().interrupt();
            }

            if (BruteForcePrimeChecker.check(i)) {
                LoggingService.logTwoArgs(i, PRIME);
            } else {
                LoggingService.logTwoArgs(i, COMPOSITE);
            }
        }
    }
}
