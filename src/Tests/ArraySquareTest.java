package Tests;

import Algorithms.ArraySquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySquareTest {

    @Test
    void testArraySquare() {
        int[] nums = {-7,-3,2,3,11};
        int[] expectedResult = {4,9,9,49,121};

        ArraySquare arraySquare = new ArraySquare();
        int[] actualResult = arraySquare.arraySquare(nums);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
