package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 27.12.2018 at 19:41.
 */

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(333));
    }

    public static int sumDigits(int number) {


        if (number < 0) {
            return -1;
        } else if (number <= 9) {
            return number;
        } else {
            int sum = 0;
            while (number > 0) {
                sum = sum + (number % 10);
                number = number / 10;
            }
            return sum;
        }

    }
}
