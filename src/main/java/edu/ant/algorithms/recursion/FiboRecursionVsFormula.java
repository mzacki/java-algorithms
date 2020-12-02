package edu.ant.algorithms.recursion;

import java.util.Scanner;

public class FiboRecursionVsFormula {
    public static void main(String[] args) {
        System.out.println("Porównanie szybkości algorytmów");
        System.out.println("----------------------------------------");
        System.out.println("Rekursja vs obliczanie ze wzoru");
        System.out.println("\nPodaj, który wyraz ciągu Fibonacciego chcesz uzyskać...");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Dziękuję.");
        scan.close();
        System.out.println("\nObliczam...");
        System.out.println( "\nZłota proporcja (liczba PHI) wynosi: " + PHI);
        long start = System.currentTimeMillis();
        System.out.println("\nObliczam rekursywnie...");
        System.out.println(n + " wyraz ciągu to " + fibonacciRecursive(n));
        long end = System.currentTimeMillis() - start;
        System.out.println("Czas (ms): " + end);
        System.out.println("\nObliczam ze wzoru...");
        long start2 = System.currentTimeMillis();
        System.out.println(n + " wyraz ciągu to " + fibonacciFormula(n));
        long end2 = System.currentTimeMillis() - start2;
        System.out.println("Czas (ms): " + end2 );

    }

    public static final double PHI = (1 + Math.sqrt(5)) / 2;

    public static double fibonacciFormula(double n) {

        return Math.floor((Math.pow(PHI, n) - Math.pow((1 - PHI), n)) / Math.sqrt(5));
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

}
