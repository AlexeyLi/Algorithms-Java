package Tests;

import Algorithms.PalindromeString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeStringTest {

    @Test
    void testIsPalindrome() {
        String str = "A man, a plan, a canal: Panama";

        PalindromeString palindrome = new PalindromeString();
        Assertions.assertTrue(palindrome.isPalindrome(str));
    }

    @Test
    void testIsPalindromeNegative() {
        String str = "this is not a palindrome";

        PalindromeString palindrome = new PalindromeString();
        Assertions.assertFalse(palindrome.isPalindrome(str));
    }

    @Test
    void testIsPalindromeInPlace() {
        String str = "98A man, a plan, a canal: Panama89";

        PalindromeString palindrome = new PalindromeString();
        Assertions.assertTrue(palindrome.isPalindromeInPlace(str));
    }

    @Test
    void testIsPalindromeInPlaceNegative() {
        String str = "this is not a palindrome";

        PalindromeString palindrome = new PalindromeString();
        Assertions.assertFalse(palindrome.isPalindromeInPlace(str));
    }

    @Test
    void testIsPalindromeWithoutRegex() {
        String str = "98A man, a plan, a canal: Panama89";

        PalindromeString palindrome = new PalindromeString();
        Assertions.assertTrue(palindrome.isPalindromeWithoutRegex(str));
    }

    @Test
    void testIsPalindromeWithoutRegexNegative() {
        String str = "this is not a palindrome";

        PalindromeString palindrome = new PalindromeString();
        Assertions.assertFalse(palindrome.isPalindromeWithoutRegex(str));
    }
}
