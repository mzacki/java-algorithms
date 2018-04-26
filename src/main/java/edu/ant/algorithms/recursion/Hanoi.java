package edu.ant.algorithms.recursion;

public class Hanoi {

    private static final int DISK_NUMBER = 3;

    public static void main(String[] args) {
        hanoiSolver(DISK_NUMBER, 'A', 'C', 'B');
    }

    public static void hanoiSolver(int n, char source, char temp, char target) {

        if (n == 1) {
            System.out.println("Moving disk 1 from " + source + " to " + target);
        } else {
            hanoiSolver(n - 1, source, target, temp);
            System.out.println("Moving disk " + n + " from " + source + " to " + target);
            hanoiSolver(n - 1, temp, source, target);
        }
    }

}
