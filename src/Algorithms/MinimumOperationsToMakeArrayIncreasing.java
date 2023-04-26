package Algorithms;

// LeetCode 1827.

// You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.
//For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
//Return the minimum number of operations needed to make nums strictly increasing.

public class MinimumOperationsToMakeArrayIncreasing {

    public int solution(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int n = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] <= nums[i]) {
                n += nums[i] - nums[i + 1] + 1;
                nums[i + 1] = nums[i] + 1;
            }
        }
        return n;
    }
    // Time: O(n)
    // Memory: O(1)
}
