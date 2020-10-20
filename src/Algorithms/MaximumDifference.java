package Algorithms;

import java.util.Arrays;

/*
    Given an array of integers, return the difference between
    the largest and the smallest integer in the array.
 */

public class MaximumDifference {

    public static int maximumDiff(int arr[]) {
        if (arr.length < 1) {
            return -1;
        }

        int min = arr[0];
        int max = arr[0];

        for (int element: arr) {
            if (element < min) {
                min = element;
            }

            if (element > max) {
                max = element;
            }
        }

        return max - min;
    }

    // O(n)

    public static int sortedArrMaximumDiff(int arr[]) {
        Arrays.sort(arr);

        if (arr.length < 1) {
            return -1;
        }

        int min = arr[0];
        int max = arr[arr.length - 1];
        return max - min;
    }

    // O(n * log(n))
}
