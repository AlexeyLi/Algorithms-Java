package Tests;

import Algorithms.MergeStringsAlternately;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeStringsAlternatelyTest {

    @Test
    void testMergeStringAlternately() {

        String word1 = "abcd";
        String word2 = "pq";

        String expectedResult = "apbqcd";

        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        String actualResult = mergeStringsAlternately.solution(word1, word2);

        Assertions.assertTrue(expectedResult.equals(actualResult));
    }
}
