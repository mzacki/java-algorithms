package edu.ant.algorithms.puzzle.solutions.codingbat;

public class CanBalance {

    public static void main(String[] args) {
        int[] input = {1, 1, 1, 2, 1};
        int[] input2 = {2, 1, 1, 2, 1};
        int[] input3 = {10, 10};
        assert(canBalance2(input));
        assert(!canBalance2(input2));
        assert(canBalance2(input3));
    }

    public static boolean canBalance(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int left = 0;
            for (int j = 0; j < i; j++) {
                left = left + nums[j];
            }

            int right = 0;
            for (int k = i; k < nums.length ; k++) {
                right = right + nums[k];
            }

            if (left == right) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean canBalance2(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }

        int left = 0;
        int right;
        for (int num : nums) {
            left = left + num;
            right = sum - left;
            if (left == right) {
                return true;
            }
        }
        return false;
    }

}
