package Algorithms;

/* Given an integer array nums sorted in non-decreasing order,
   remove the duplicates in-place such that each unique element appears only once.
   The relative order of the elements should be kept the same.
    Then return the number of unique elements in nums.
 */

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicatesFromSortedArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int leftPointer = 1;
        int rightPointer = 1;

        while (rightPointer <= nums.length - 1) {
            if (nums[rightPointer] != nums[rightPointer - 1]) {
                nums[leftPointer] = nums[rightPointer];
                leftPointer += 1;
            }
            rightPointer += 1;
        }
        return leftPointer;
    }
}
