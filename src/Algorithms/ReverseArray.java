package Algorithms;

// Given an array, reverse the order of its elements.

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */

public class ReverseArray {

    public int[] reverseArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int start = 0;
        int end = nums.length - 1;
        int temp;

        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
        return nums;
    }
    // Time: O(n)
    // Memory: O(1)
}
