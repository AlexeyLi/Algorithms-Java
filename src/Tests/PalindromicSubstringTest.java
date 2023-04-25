package Tests;

import Algorithms.PalindromicSubstring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromicSubstringTest {

    @Test
    void testPalindromicSubstring() {
        String str = "aaa";
        int expectedResult = 6;

        PalindromicSubstring palindromicSubstring = new PalindromicSubstring();
        int actualResult = palindromicSubstring.solution(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
