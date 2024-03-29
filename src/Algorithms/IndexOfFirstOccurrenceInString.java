package Algorithms;

// LeetCode 28.

// Given two strings needle and haystack,
// return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class IndexOfFirstOccurrenceInString {

    public int solution(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }
}
