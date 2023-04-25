package Algorithms;

public class BinarySearch {

    public int searchBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int search(int[] arr, int target) {
        return binarySearchRecursion(arr, target, 0, arr.length - 1);
    }

    public int binarySearchRecursion(int[] arr, int target, int left, int right) {
        int middleIndex = (left + right) / 2;

        if (right < left) {
            return -1;
        }

        if (arr[middleIndex] == target) {
            return middleIndex;
        } else if (target < arr[middleIndex]) {
            int newRight = middleIndex - 1;
            return binarySearchRecursion(arr, target, left, newRight);
        } else {
            int newLeft = middleIndex + 1;
            return binarySearchRecursion(arr, target, newLeft, right);
        }

        // TIME: O(log n)
        // MEMORY: O(1)
    }
}
