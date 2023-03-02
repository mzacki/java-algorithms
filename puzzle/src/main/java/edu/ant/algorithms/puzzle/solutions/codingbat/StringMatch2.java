package edu.ant.algorithms.puzzle.solutions.codingbat;

public class StringMatch2 {

    public static void main(String[] args) {
        String a = "xxcaaz";
        String b = "xxbaazz";

        System.out.println(stringMatch(a, b));
    }

    public static int stringMatch(String a, String b) {

        String first = a;
        String second = b;

        if (a.length() > b.length()) {
            first = a.substring(0, b.length());
        } else if (a.length() < b.length()) {
            second = b.substring(0, a.length());
        }

        int counter = 0;
        for (int i = 0; i < first.length() - 1; i++) {

            if (first.charAt(i) == second.charAt(i) && first.charAt(i + 1) == second.charAt(i + 1)) {
                counter++;
            }

        }

        return counter;
    }

}
