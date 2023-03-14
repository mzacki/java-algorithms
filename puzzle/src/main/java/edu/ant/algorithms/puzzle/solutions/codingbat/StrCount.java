package edu.ant.algorithms.puzzle.solutions.codingbat;

public class StrCount {

    /**
     * Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
     * without the sub strings overlapping.
     * strCount("catcowcat", "cat") → 2
     * strCount("catcowcat", "cow") → 1
     * strCount("catcowcat", "dog") → 0
     * */

    public static void main(String[] args) {
        System.out.println(strCount("catowcacatowca", "cat"));
    }

    public static int strCount(String str, String sub) {
        int lastIndex = str.lastIndexOf(sub);
        if (lastIndex < 0) {
            return 0;
        }
        return strCount(str.substring(0, lastIndex), sub) + 1;
    }

}
