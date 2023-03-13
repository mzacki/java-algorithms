package edu.ant.algorithms.puzzle.solutions.codingbat;

public class NestParen {

    /**
     *
     Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
     Suggestion: check the first and last chars, and then recur on what's inside them.
     nestParen("( ( ) )") → true
     nestParen("((()))") → true
     nestParen("(((x))") → false
     *
     * */

    public static void main(String[] args) {
        System.out.println(nestParen("(()u"));
    }

    public static boolean nestParen(String str) {

        if (str.equals("")) return true;

        if (str.length() == 1) return false;

        if (str.length() == 2) return str.charAt(0) == '(' && str.charAt(1) == ')';

        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
           return nestParen(str.substring(1, str.length() - 1));
        }

        return false;
    }

}
