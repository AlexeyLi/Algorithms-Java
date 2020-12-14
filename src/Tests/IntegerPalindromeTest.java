package Tests;

import Algorithms.IntegerPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerPalindromeTest {

    @Test
    void testPalindromeNumber() {
        int num = 123321;
        boolean expectedResult = true;
        boolean actualResult = IntegerPalindrome.isPalindrome(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testFalsePalindromeNumber() {
        int num = 1233521;
        boolean expectedResult = false;
        boolean actualResult = IntegerPalindrome.isPalindrome(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testNegativePalindromeNumber() {
        int num = -123321;
        boolean expectedResult = false;
        boolean actualResult = IntegerPalindrome.isPalindrome(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
