package edu.ant.algorithms.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibo2 {

    private static Map<Integer, Integer> elems;
    private static final int NTH = 5;

    public static void main(String[] args) {
        elems = new HashMap<>();
        elems.put(1, 0);
        elems.put(2, 1);
       System.out.println("The " + NTH + "th element of the sequence equals: " + fibo(NTH));
    }

    private static int fibo(int n) {

        System.out.println("Counting " + n + "th element of the sequence");

        if (elems.containsKey(n)) {
            return elems.get(n);
        } else {
            int value = fibo(n - 1) + fibo(n - 2);
            elems.put(n, value);
            return value;
        }

    }

}
