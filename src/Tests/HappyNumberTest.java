package Tests;

import Algorithms.HappyNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    HappyNumber happyNumber = new HappyNumber();

    @Test
    void testIsHappyNumber() {

        int n = 19;
        Assertions.assertTrue(happyNumber.isHappy(n));
    }

    @Test
    void testIsHappyNumberNegative() {

        int n = 2;
        Assertions.assertFalse(happyNumber.isHappy(n));

    }
}
