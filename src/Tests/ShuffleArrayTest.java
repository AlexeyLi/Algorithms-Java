package Tests;

import Algorithms.ShuffleArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleArrayTest {

    @Test
    void testShuffleArray() {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] expectedResult = {1, 4, 2, 3, 3, 2, 4, 1};
        int n = 4;

        ShuffleArray shuffleArray = new ShuffleArray();
        int[] actualResult = shuffleArray.shuffle(nums, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testShuffleArrayInPlace() {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] expectedResult = {1, 4, 2, 3, 3, 2, 4, 1};
        int n = 4;

        ShuffleArray shuffleArray = new ShuffleArray();
        int[] actualResult = shuffleArray.shuffleInPlace(nums, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
