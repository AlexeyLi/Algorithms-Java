package Algorithms;

// LeetCode 53.
// Given an array of integers, the task is to find the maximum sub array sum possible of all the non-empty sub arrays.

public class MaxSumSubArray {

    public int maxSumSubArrayBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                maxSum = maxSum < sum? sum: maxSum;
            }
        }
        return maxSum;
    }
    // Time: O(n^2)
    // Memory: O(1)

    // Kadane's Algorithm
    public int maxSumSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = nums[i] > currentSum + nums[i]? nums[i]: currentSum + nums[i];
            maxSum = maxSum < currentSum? currentSum: maxSum;
        }
        return maxSum;
    }
    // Time: O(n)
    // Memory: O(1)
}
