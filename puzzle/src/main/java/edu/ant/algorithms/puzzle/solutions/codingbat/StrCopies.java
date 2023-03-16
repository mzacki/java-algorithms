package edu.ant.algorithms.puzzle.solutions.codingbat;

/**
 * Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string
 * somewhere, possibly with overlapping. N will be non-negative. strCopies("catcowcat", "cat", 2) → true
 * strCopies("catcowcat", "cow", 2) → false strCopies("catcowcat", "cow", 1) → true
 *
 * strCopies("iiijjj", "ii", 2)
 */

public class StrCopies {

    public boolean strCopies(String str, String sub, int n) {
        if (str.length() < sub.length()) {
            return (n <= 0);
        }

        if (str.startsWith(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        }

        return strCopies(str.substring(1), sub, n);
    }

}
