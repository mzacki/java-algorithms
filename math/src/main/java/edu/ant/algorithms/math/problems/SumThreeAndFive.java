package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 25.12.2018 at 12:35.
 */

public class SumThreeAndFive {

    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum = sum + i;
                counter++;

            }
            if (counter == 5) {
                System.out.println(sum);
                break;
            }
        }
    }
}
