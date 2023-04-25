package Tests;

import Algorithms.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

    @Test
    void testRotateArray() {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedResult = {5, 6, 7, 1, 2, 3, 4};

        RotateArray rotateArray = new RotateArray();
        int[] actualResult = rotateArray.rotate(nums, 3);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
