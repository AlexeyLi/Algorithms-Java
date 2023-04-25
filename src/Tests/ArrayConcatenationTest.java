package Tests;

import Algorithms.ArrayConcatenation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayConcatenationTest {

    @Test
    void testGetConcatenation() {
        int[] nums = {1, 2, 1};
        int[] expectedResult = {1, 2, 1, 1, 2, 1};

        ArrayConcatenation arrayConcatenation = new ArrayConcatenation();
        int[] actualResult = arrayConcatenation.getConcatenation(nums);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
