package Tests;

import Algorithms.UglyNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UglyNumberTest {

    @Test
    void testUglyNumber() {

        int n = 6;

        UglyNumber uglyNumber = new UglyNumber();

        Assertions.assertTrue(uglyNumber.solution(n));
    }
}
