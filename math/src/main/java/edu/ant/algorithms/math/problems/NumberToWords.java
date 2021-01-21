package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 11:26.
 */

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static int reverse(int number) {

        int temp = number < 0 ? number / -1 : number;

        int reverse = 0;
        int lastDigit;

        while (temp > 0) {
            lastDigit = temp % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            temp = temp / 10;
        }

        return number < 0 ? reverse / -1 : reverse;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int difference = getDigitCount(number) - getDigitCount(reverse(number));

        number = reverse(number);

        while (number > 0) {
            int last = number % 10;
            switch (last) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");
            }
            number /= 10;
        }

        for (int i = 0; i < difference ; i++) {
            System.out.println("Zero");
        }

    }
}
