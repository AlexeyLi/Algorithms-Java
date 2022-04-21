package Algorithms;

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int writePoint = 0;

        for (int readPoint = 0; readPoint < nums.length; readPoint++) {
            if (nums[readPoint] != 0) {
                nums[writePoint] = nums[readPoint];
                writePoint += 1;
            }
        }

        for (int i = writePoint; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
    // Time: O(n)
    // Memory: O(1)
}
