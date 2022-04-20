package Algorithms;

// Given a sorted array in non-decreasing order, return an array of squares of each number, also in non-decreasing order.

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */

public class ArraySquare {

    public int[] arraySquare(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];
        int resultEnd = result.length - 1;

        while (start < end) {
            if (abs(nums[start]) > abs(nums[end])) {
                result[resultEnd] = square(abs(nums[start]));
                start += 1;
            } else {
                result[resultEnd] = square(abs(nums[end]));
                end -= 1;
            }
            resultEnd -= 1;
        }
        return result;
    }

    private int abs(int num) {
        return num < 0? num * -1: num;
    }

    private int square(int num) {
        return num * num;
    }
}
