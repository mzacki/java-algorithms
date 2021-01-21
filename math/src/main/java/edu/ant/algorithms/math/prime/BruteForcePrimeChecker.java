package edu.ant.algorithms.math.prime;

import edu.ant.patterns.utils.logger.LoggingService;

public class BruteForcePrimeChecker {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (check(i)) {
                LoggingService.logMsg(i + " " + check(i));
            }
        }

    }

    public static boolean check(long n) {

        if (n <= 0) {
            throw new IllegalArgumentException("Argument has to be greater than zero");
        }

        for (long i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
