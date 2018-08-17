package edu.ant.algorithms.concurrency;

public class PrimeCheckerMain {

    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker(100, 1000);
        checker.run();
    }

}
