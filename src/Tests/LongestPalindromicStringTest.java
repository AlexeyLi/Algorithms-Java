package Tests;

import Algorithms.LongestPalindromicSubString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicStringTest {

    @Test
    void testLongestPalindromicSubString() {
        String str = "abbac";
        String expectedResult = "abba";

        LongestPalindromicSubString longestPalindromicString = new LongestPalindromicSubString();
        String actualResult = longestPalindromicString.solution(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
