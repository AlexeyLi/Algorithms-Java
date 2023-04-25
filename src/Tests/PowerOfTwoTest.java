package Tests;

import Algorithms.PowerOfTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfTwoTest {

    @Test
    void testPowerOfTwo() {

        int n = 16;

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertTrue(powerOfTwo.isPowerOfTwo(n));
    }

    @Test
    void testPowerOfTwoNegative() {
        int n = 3;

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertFalse(powerOfTwo.isPowerOfTwo(n));
    }
}
