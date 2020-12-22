package Algorithms;

import java.util.Arrays;

public class MoveZeroes {

    /*
    Given an array nums,
    write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Example:
    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]

     */
    public static void moveZeroes(int[] nums) {

        int writePointer = 0;

        for(int readPointer = 0; readPointer < nums.length; readPointer++) {
            if(nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        for (int i = writePointer; i < nums.length; i++) {
            nums[i] = 0;
        }

        // Time: O(n)
        // Memory: O(1)
    }
}
