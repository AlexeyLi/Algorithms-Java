package Algorithms;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */

import java.util.HashMap;

public class TwoSum {

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }
    // Time: O(n^2)
    // Memory: O(1)

    public int[] twoSumHashmap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
    // Time: O(n)
    // Memory: O(n)

    // The array must be sorted
    public int[] twoSumTraverseArrayFromBothEnds(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] + nums[end] == target) {
                return new int[] {start, end};
            } else if (nums[start] + nums[end] < target) {
                start +=1;
            } else if (nums[start] + nums[end] > target) {
                end -= 1;
            }
        }

        return null;
    }
    // Time: O(n)
    // Memory: O(1)
}
