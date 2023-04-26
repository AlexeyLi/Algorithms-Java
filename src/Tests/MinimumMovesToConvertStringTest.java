package Tests;

import Algorithms.MinimumMovesToConvertString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumMovesToConvertStringTest {

    @Test
    void testSolution() {
        String s = "XXXOXXXO";
        int expectedResult = 2;

        MinimumMovesToConvertString minimumMovesToConvertString = new MinimumMovesToConvertString();
        int actualResult = minimumMovesToConvertString.solution(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
