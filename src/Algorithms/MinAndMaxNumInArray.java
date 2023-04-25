package Algorithms;

// Given an array of numbers, find the min and max numbers.

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */


public class MinAndMaxNumInArray {

    public int[] minAndMaxNum(int[] nums) {

        if (nums == null || nums.length == 0) {
            return null;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }

        return new int[]{min, max};
    }
    // Time: O(n)
    // Memory: O(1)
}
