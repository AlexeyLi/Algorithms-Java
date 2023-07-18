package Algorithms;

// LeetCode 485.

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class MaxConsecutiveOnes {

    public int solution(int[] nums) {

        int numOfOnes = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                numOfOnes += 1;
            } else {
                numOfOnes = 0;
            }

            result = result > numOfOnes? result: numOfOnes;
        }

        return result;
    }
}
