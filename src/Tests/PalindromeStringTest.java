package Tests;

import Algorithms.PalindromeString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeStringTest {

    @Test
    void testIsPalindrome() {
        String str = "racecar";
        boolean expectedResult = true;
        boolean actualResult = PalindromeString.isPalindrome(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testFalsePalindrome() {
        String str = "abcbca";
        boolean expectedResult = false;
        boolean actualResult = PalindromeString.isPalindrome(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testEmptyPalindrome() {
        String str = "";
        boolean expectedResult = true;
        boolean actualResult = PalindromeString.isPalindrome(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testOneLetterPalindrome() {
        String str = "a";
        boolean expectedResult = true;
        boolean actualResult = PalindromeString.isPalindrome(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testEvenPalindrome() {
        String str = "abba";
        boolean expectedResult = true;
        boolean actualResult = PalindromeString.isPalindrome(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
