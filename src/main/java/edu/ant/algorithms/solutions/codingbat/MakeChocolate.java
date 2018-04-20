package edu.ant.algorithms.solutions.codingbat;

public class MakeChocolate {

    public int makeChocolate(int small, int big, int goal) {

        int result = 0;

        if (big * 5 == goal) {
            result = 0;
        }

        if (big * 5 > goal) {
            result = goal - (goal / 5) * 5;
        }

        if (big * 5 < goal) {
            result = goal - big * 5;
        }

        if (result <= small) {
            return result;
        } else {
            return -1;
        }

    }

}

