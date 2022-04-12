package Tests;

import Algorithms.CloneEvenNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CloneEvenNumbersTest {

    @Test
    void testCloneEvenNumbersOneArray() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -1, -1, -1, -1};
        int[] expectedResult = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10};
        CloneEvenNumbers cloneEvenNumbers = new CloneEvenNumbers();
        int[] actualResult = cloneEvenNumbers.cloneEvenNumbers(nums);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
