package Algorithms;

// A phrase is a palindrome if,
// after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */

public class PalindromeString {

    public boolean isPalindrome(String str) {
        String newStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (newStr.isEmpty() || newStr.length() == 1) {
            return true;
        }

        int x = newStr.length() - 1;
        String result = "";

        while (x >= 0) {
            result += newStr.charAt(x);
            x -= 1;
        }

        return newStr.equals(result);
    }
    // Time: O(n)
    // Memory: O(n)

    public boolean isPalindromeInPlace(String str) {
        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");

        if (newStr.isEmpty() || newStr.length() == 1) {
            return true;
        }

        int startPoint = 0;
        int endpoint = newStr.length() - 1;

        while (startPoint <= endpoint) {
            if (newStr.toLowerCase().charAt(startPoint) != newStr.toLowerCase().charAt(endpoint)) {
                return false;
            }
            startPoint += 1;
            endpoint -= 1;
        }
        return true;
    }
    // Time: O(n)
    // Memory: O(1)

    public boolean isPalindromeWithoutRegex(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
    // Time: O(n)
    // Memory: O(1)
}
