package edu.ant.algorithms.recursion;

import edu.ant.algorithms.utils.logger.LoggingService;
import java.util.Scanner;

public class FiboRecursionVsFormula {

    public static void main(String[] args) {
        LoggingService.logMessage("Algorithm speed comparator");
        LoggingService.logMessage("----------------------------------------");
        LoggingService.logMessage("Recursion vs mathematic formula");
        LoggingService.logMessage("\nWrite which n-th element of Fibonacci sequence you wish to count (and press Enter)");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LoggingService.logMessage("Thank you");
        scan.close();
        LoggingService.logMessage("\nCounting...");
        LoggingService.logMessage("\nGolden ration (a.k.a. PHI number): " + PHI);
        long start = System.currentTimeMillis();
        LoggingService.logMessage("\nCounting recursively...");
        LoggingService.logMessage(n + "th element is " + fibonacciRecursive(n));
        long end = System.currentTimeMillis() - start;
        LoggingService.logMessage("Time (ms): " + end);
        LoggingService.logMessage("\nCounting with formula...");
        long start2 = System.currentTimeMillis();
        LoggingService.logMessage(n + "th element is " + fibonacciFormula(n));
        long end2 = System.currentTimeMillis() - start2;
        LoggingService.logMessage("Time (ms): " + end2);
        LoggingService.logMessage("Thank you for your attention Sir / Madam.");
    }

    public static final double PHI = (1 + Math.sqrt(5)) / 2;

    public static double fibonacciFormula(double n) {
        return Math.floor((Math.pow(PHI, n) - Math.pow((1 - PHI), n)) / Math.sqrt(5));
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

}
