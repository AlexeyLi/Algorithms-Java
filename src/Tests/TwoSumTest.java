package Tests;

import Algorithms.TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testTwoSumBruteForce() {
        int[] array = {6, 3, 5, 2, 1, 7};
        int target = 4;
        int[] expectedResult = {1, 4};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumBruteForce(array, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testTwoSumHashMap() {
        int[] array = {6, 3, 5, 2, 1, 7};
        int target = 4;
        int[] expectedResult = {1, 4};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumHashmap(array, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testTwoSumTraverseArray() {
        int[] array = {1, 3, 4, 6, 8, 10};
        int target = 14;
        int[] expectedResult = {2, 5};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumTraverseArrayFromBothEnds(array, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
