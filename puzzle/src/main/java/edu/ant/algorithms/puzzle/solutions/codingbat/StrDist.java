package edu.ant.algorithms.puzzle.solutions.codingbat;

public class StrDist {

    /**
     *
     Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
     strDist("catcowcat", "cat") → 9
     strDist("catcowcat", "cow") → 3
     strDist("cccatcowcatxx", "cat") → 9
     * */

    public int strDistNonRecursive(String str, String sub) {

        if (!str.contains(sub)) {
            return 0;
        }

        int firstIndex = str.indexOf(sub);

        if (firstIndex == str.lastIndexOf(sub)) {
            return sub.length();
        }

        return str.lastIndexOf(sub) + sub.length() - firstIndex;

    }

    // if we're forced to use recursion.... but also any other recursive solution I found is an overcomplicated overkill!

    public int strDist(String str, String sub) {

        if (!str.contains(sub)) {
            return 0;
        }

        int firstIndex = str.indexOf(sub);
        int lastIndex = str.lastIndexOf(sub);

        if (firstIndex == lastIndex) {
            return sub.length();
        }

        String longestSub = str.substring(str.indexOf(sub), str.lastIndexOf(sub) + sub.length());

        return strDist(longestSub, longestSub);

    }

}
