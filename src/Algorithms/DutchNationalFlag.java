package Algorithms;

// Given an array of integers A and a pivot, rearrange A in the following order: [Elements less than pivot, elements equal to pivot, elements greater than pivot]

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */

public class DutchNationalFlag {

    public int[] dutchNationalFlag(int[] nums, int pivot) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int lowBoundary = 0;
        int highBoundary = nums.length - 1;
        int i = 0;
        int temp;

        while (i <= highBoundary) {
            if (nums[i] < pivot) {
                temp = nums[i];
                nums[i] = nums[lowBoundary];
                nums[lowBoundary] = temp;
                lowBoundary += 1;
                i += 1;
            } else if (nums[i] > pivot) {
                temp = nums[i];
                nums[i] = nums[highBoundary];
                nums[highBoundary] = temp;
                highBoundary -= 1;
            } else {
                i += 1;
            }
        }

        return nums;
    }
    // Time: O(n)
    // Memory: O(1)
}
