package Tests;

import Algorithms.ReverseInt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestReverseInt {

    @Test
    void testReverseInt() {
        int x = -123;
        int expectedresult = -321;
        Assertions.assertEquals(expectedresult, ReverseInt.reverseInt(x));
    }
}
