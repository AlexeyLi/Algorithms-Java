package Tests;

import Algorithms.LongestUniqueCharacterSubString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestUniqueCharacterSubStringTest {

    @Test
    void testLongestUniqueCharacterSubString() {
        String str = "whatwhywhere";

        int[] expectedResult = {2, 6};

        LongestUniqueCharacterSubString longestUniqueCharacterSubString = new LongestUniqueCharacterSubString();
        int[] actualResult = longestUniqueCharacterSubString.longestUniqueCharacterSubString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
