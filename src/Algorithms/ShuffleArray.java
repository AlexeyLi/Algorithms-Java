package Algorithms;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {

        if (nums == null || nums.length == 0) {
            return null;
        }

        int[] result = new int[nums.length];
        int y = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            result[y] = nums[i];
            result[y + 1] = nums[i + n];
            y += 2;
        }
        return result;
    }
    // Time: O(n)
    // Memory: O(n^2)

    public int[] shuffleInPlace(int[] nums, int n) {
        int low;
        int high;
        int temp;
        for (int i = 1; i<n; i++) {
            low = i;
            high = n;
            for (int j = i; j < n; j++) {
                temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high++;
            }
        }
        return nums;
    }
}
