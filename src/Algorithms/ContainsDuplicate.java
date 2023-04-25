package Algorithms;

import java.util.HashMap;

// LeetCode 217.
/* Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.
 */

public class ContainsDuplicate {

    public boolean solution(int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
    // Time: O(n)
    // Memory: O(1)
}
