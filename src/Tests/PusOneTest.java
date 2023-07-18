package Tests;

import Algorithms.PlusOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PusOneTest {

    @Test
    void testPlusOne() {

        int[] digits = {8, 9, 9, 9};
        int[] expectedResult = {9, 0, 0, 0};

        PlusOne plusOne = new PlusOne();
        int[] actualResult = plusOne.solution(digits);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
