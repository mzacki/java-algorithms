package edu.ant.algorithms.puzzle.solutions.codingbat;

public class CountClumps {

    /**
     * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of
     * clumps in the given array. countClumps([1, 2, 2, 3, 4, 4]) → 2 countClumps([1, 1, 2, 1, 1]) → 2 countClumps([1,
     * 1, 1, 1, 1]) → 1
     */

    public int countClumps(int[] nums) {

        int index = 0;
        int numberOfClumps = 0;
        while (index < nums.length - 1) {

            int currentValue = nums[index];
            boolean samePreviousValue = index > 0  && nums[index - 1] == nums[index];

                if (!samePreviousValue && nums[index + 1] == currentValue) {
                    numberOfClumps++;
                    index++;
                }

            index++;
        }
        return numberOfClumps;
    }

}
