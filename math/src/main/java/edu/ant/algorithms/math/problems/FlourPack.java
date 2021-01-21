package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 15:11.
 */

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        return (bigCount * 5 == goal || smallCount == goal) ||

                (bigCount * 5 < goal && goal - bigCount * 5 <= smallCount) ||

                bigCount * 5 > goal && goal - (goal / 5) * 5 <= smallCount;

    }

}
