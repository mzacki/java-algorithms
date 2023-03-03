package edu.ant.algorithms.puzzle.solutions.codingbat;

import java.util.Arrays;

public class Fix45 {

    public static void main(String[] args) {
        int[] input = {5, 4, 9, 4, 9, 5};
        int[] input2 = {1, 4, 1, 5};
        int[] input3 = {1, 4, 1, 5, 5, 4, 1};
        var result = fix45(input);
        var result2 = fix45(input2);
        var result3 = fix45(input3);
        assert Arrays.equals(result, new int[]{9, 4, 5, 4, 5, 9});
        assert Arrays.equals(result2, new int[]{1, 4, 5, 1});
        assert Arrays.equals(result3, new int[]{1, 4, 5, 1, 1, 4, 5});
    }


    static int[] fix45(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] == 4) {
                int insteadOfFive = nums[i];
                nums[i] = 5;

                for (int j = 0; j < nums.length; j++) {
                    if ((j == 0 && nums[j] == 5) || (j > 0 && nums[j] == 5 && nums[j - 1] != 4)) {
                        nums[j] = insteadOfFive;
                        break;
                    }
                }
            }
        }
        return nums;
    }

}
