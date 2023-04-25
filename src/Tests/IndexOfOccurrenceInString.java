package Tests;

import Algorithms.IndexOfFirstOccurrenceInString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexOfOccurrenceInString {

    @Test
    void testSolution() {

        String haystack = "sadbutsad";
        String needle = "sad";

        IndexOfFirstOccurrenceInString indexOfFirstOccurrenceInString = new IndexOfFirstOccurrenceInString();

        int expectedResult = 0;
        int actualResult = indexOfFirstOccurrenceInString.solution(haystack, needle);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSolutionNegativeCase() {
        String haystack = "leetcode";
        String needle = "leeto";

        IndexOfFirstOccurrenceInString indexOfFirstOccurrenceInString = new IndexOfFirstOccurrenceInString();

        int expectedResult = -1;
        int actualResult = indexOfFirstOccurrenceInString.solution(haystack, needle);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
