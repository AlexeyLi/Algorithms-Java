package Algorithms;

public class PalindromeString {

    // A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam, racecar.

    // Write a function that takes a String and returns Boolean - whether the String is palindrome

    public static boolean isPalindromeFirstDraft(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Time: O(n)
    // Memory: O(n)

    public static boolean isPalindromeSecondDraft(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return str.equals(reversedStr);
    }

    // Time: O(n)
    // Memory: O(n)

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int leftChar = str.charAt(i);
            int rightChar = str.charAt(str.length() - 1 - i);
            if (leftChar != rightChar) {
                return false;
            }
        }

        return true;
    }

    // Time: O(n)
    // Memory: O(1)
}
