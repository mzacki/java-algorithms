package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 21.12.2018 at 13:45.
 */

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(15,2,2));
    }
    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }

    /*public static boolean hasTeen(int x, int y, int z) {
        return isTeen(x) || isTeen(y) || isTeen(z);
    }*/

    public static boolean hasTeen(int x, int y, int z) {
        int[] teens = {x, y, z};
        for (int i = 0; i < teens.length; i++) {
            if (teens[i] >= 13 && teens[i] <= 19) {
                return true;
            }

        }
        return false;
    }
}


