package edu.ant.algorithms.solutions.codingbat;

public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        return (big * 5 == goal || small == goal) ||
                (big * 5 < goal && goal - big * 5 <= small) ||
                big * 5 > goal && goal - (goal / 5) * 5 <= small;
    }

}

