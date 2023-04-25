package Algorithms;

// LeetCode 88.
/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int x = m - 1;
        int y = n - 1;
        int lastIndex = m + n - 1;

        while (y >= 0) {
            if (x >=0 && nums1[x] > nums2[y]) {
                nums1[lastIndex] = nums1[x];
                x -= 1;
                lastIndex -= 1;
            } else {
                nums1[lastIndex] = nums2[y];
                y -= 1;
                lastIndex -= 1;
            }
        }
        return nums1;
    }
    // Time: O(n)
    // Memory: O(1)
}
