package edu.ant.algorithms.puzzle.solutions.codingbat;


public class LinearIn {

    /**
    *
     Given two arrays of ints sorted in increasing order, outer and inner,
     return true if all the numbers in inner appear in outer.
     The best solution makes only a single "linear" pass of both arrays,
     taking advantage of the fact that both arrays are already in sorted order.

     linearIn([1, 2, 4, 6], [2, 4]) → true
     linearIn([1, 2, 4, 6], [2, 3, 4]) → false
     linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     linearIn([2, 2, 2, 2, 2], [2, 4]) -> false
    *
    * */

    public static void main(String[] args) {

        int[] outer = {1, 2, 4, 6};
        int[] inner = {2, 4};

        System.out.println(linearIn(outer, inner));
    }

    public static boolean linearIn(int[] outer, int[] inner) {

        if (inner.length == 0 || outer.length == 0) return true;

        int counter = 0;
        int innerIndex = 0;
        for (int o : outer) {

            if (o > inner[innerIndex]) return false;

            if (o == inner[innerIndex]) {
                counter++;
                innerIndex++;
            }

            if (counter == inner.length) return true;

        }
        return false;
    }



}
