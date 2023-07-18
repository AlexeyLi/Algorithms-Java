package Tests;

import Algorithms.AddBinary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddBinaryTest {

    @Test
    void testAddBinary() {
        String a = "11";
        String b = "1";

        String expectedResult = "100";

        AddBinary addBinary = new AddBinary();
        String actualResult = addBinary.solution(a, b);

        Assertions.assertTrue(expectedResult.equals(actualResult));
    }
}
