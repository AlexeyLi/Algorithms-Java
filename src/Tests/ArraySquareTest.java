package Tests;

import Algorithms.ArraySquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySquareTest {

    @Test
    void testArraySquare() {
        int[] nums = {-4, -2, -1, 0, 3, 5};
        int[] expectedResult = {0, 1, 4, 9, 16, 25};

        ArraySquare arraySquare = new ArraySquare();
        int[] actualResult = arraySquare.arraySquare(nums);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
