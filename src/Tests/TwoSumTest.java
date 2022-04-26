package Tests;

import Algorithms.TwoSum;

import com.sun.tools.javac.util.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testTwoSumBruteForce() {
        int[] nums = {6, 3, 5, 2, 1, 7};
        int target = 4;
        int[] expectedResult = {1, 4};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumBruteForce(nums, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testTwoSumHashMap() {
        int[] nums = {6, 3, 5, 2, 1, 7};
        int target = 4;
        int[] expectedResult = {1, 4};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumHashmap(nums, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testTwoSumTraverseArray() {
        int[] nums = {1, 3, 4, 6, 8, 10};
        int target = 14;
        int[] expectedResult = {2, 5};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumTraverseArrayFromBothEnds(nums, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testTwoSumSlidingWindow() {
        int[] nums = {5, 3, 1, 7, 6, 4, 2, 3};
        Pair<Integer, Integer> expectedResult = new Pair<>(2, 4);

        TwoSum twoSum = new TwoSum();
        Pair<Integer, Integer> actualResult = twoSum.twoSumSlidingWindow(nums, 14);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
