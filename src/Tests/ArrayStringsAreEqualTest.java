package Tests;

import Algorithms.ArrayStringsAreEqual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayStringsAreEqualTest {

    @Test
    void testArrayStringsAreEqual() {

        String[] word1  = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        ArrayStringsAreEqual arrayStringsAreEqual = new ArrayStringsAreEqual();

        Assertions.assertTrue(arrayStringsAreEqual.solution(word1, word2));
    }
}
