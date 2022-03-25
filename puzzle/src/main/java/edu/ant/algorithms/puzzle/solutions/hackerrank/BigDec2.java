package edu.ant.algorithms.puzzle.solutions.hackerrank;

import java.math.BigDecimal;
import java.util.*;

class BigDec2 {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Write your code here
        Arrays.sort(s, (o1, o2) -> {
            if (o1 == null || o2 == null) {
                return 0;
            }
            BigDecimal bigDecimal1 = new BigDecimal(o1);
            BigDecimal bigDecimal2 = new BigDecimal(o2);

            return bigDecimal2.compareTo(bigDecimal1);
        });
        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}