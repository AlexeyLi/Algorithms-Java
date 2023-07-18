package Algorithms;

// LeetCode 1480.

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

public class RunningSum {

    public int[] solution(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            nums[i] = sum;
        }

        return nums;

    }
    // Time: O(n)
    // Memory: O(n^2)
}
