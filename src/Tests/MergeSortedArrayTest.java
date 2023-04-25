package Tests;

import Algorithms.MergeSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    @Test
    void testMergeSortedArray() {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expectedResult = {1, 2, 2, 3, 5, 6};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] actualResult = mergeSortedArray.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
