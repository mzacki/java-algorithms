package edu.ant.algorithms.puzzle.solutions.hackerrank;

import java.util.Arrays;

public class ReverseCharArray {

    public static void main(String[] args) {
        String input = "ALAMAKOTA";
        String evenInput = "ALAMAKOT";

        System.out.println(Arrays.toString(reverse(input.toCharArray())));
        System.out.println(Arrays.toString(reverse(evenInput.toCharArray())));
    }

    public static char[] reverse(char[] array) {
        int lastSwitch = (array.length / 2) - 1;

        for (int i = 0; i <= lastSwitch; i++) {
            char toReplace = array[i];
            char replacement = array[array.length - i -1];
            array[i] = replacement;
            array[array.length - i -1] = toReplace;
        }
        return array;
    }

}
