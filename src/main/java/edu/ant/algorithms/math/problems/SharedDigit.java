package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 09:20.
 */
public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        while (a > 0) {

            int lastA = a % 10;
            int temp = b;

            while (temp > 0) {
                int lastTemp = temp % 10;

                if (lastA == lastTemp) {
                    return true;
                }
                temp /= 10;
            }
            a /= 10;
        }
        return false;
    }
}
