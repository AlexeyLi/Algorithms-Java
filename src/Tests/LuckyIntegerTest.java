package Tests;

import Algorithms.LuckyInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LuckyIntegerTest {

    @Test
    void testLuckyInteger() {

        int[] arr = {2, 2, 3, 4};
        int expectedResult = 2;

        LuckyInteger luckyInteger = new LuckyInteger();
        int actualResult = luckyInteger.solution(arr);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
