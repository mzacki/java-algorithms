package edu.ant.algorithms.math.prime;

import edu.ant.algorithms.utils.logger.LoggingService;

/**
 * Created by Matt on 09.09.2018 at 18:28.
 */

public class PrimeThreads {

    public static void main(String[] args) {
        int n = 5;
        PrimeThreads pt = new PrimeThreads(n);
    }

    public PrimeThreads(int n) {

        PrimeFinder[] finder = new PrimeFinder[n];

        for (int i = 0; i < n; i++) {
            try {
                long count = i;
                finder[i] = new PrimeFinder(count);
                LoggingService.logMessage("Searching for the prime number " + count);
            } catch (NumberFormatException e) {
                LoggingService.logMessage("Exception: " + e.getMessage());
            }
        }

        boolean complete = false;

        while (!complete) {
            complete = true;
            for (int j = 0; j < finder.length; j++) {
                if (finder[j] == null)
                    continue;
                if (!finder[j].isFinished()) {
                    complete = false;
                } else {
                    displayResult(finder[j]);
                    finder[j] = null;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                LoggingService.getLogger().error(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }

    private void displayResult(PrimeFinder finder) {
        LoggingService.logMessage(finder.getTarget() + " prime number is " + finder.getPrime());
    }
}
