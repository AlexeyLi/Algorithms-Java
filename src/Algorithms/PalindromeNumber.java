package Algorithms;

public class PalindromeNumber {

    public boolean isPalindrome(int num) {

        if (num < 0) {
            return false;
        }

        int result = 0;
        int nums = num;

        while(num > 0) {
            result = result * 10 + num % 10;
            num = num / 10;
        }

        return result == nums;
    }
}
