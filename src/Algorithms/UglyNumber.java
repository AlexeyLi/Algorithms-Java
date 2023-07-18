package Algorithms;

// LeetCode 263.

// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
// Given an integer n, return true if n is an ugly number.

public class UglyNumber {

    public boolean solution(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }
    // Time: O(n)
    // Memory: O(1)
}
