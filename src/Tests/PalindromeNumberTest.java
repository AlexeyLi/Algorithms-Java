package Tests;

import Algorithms.PalindromeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    void testPalindromeNumber() {

        int num = 121;

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertTrue(palindromeNumber.isPalindrome(num));
    }
}
