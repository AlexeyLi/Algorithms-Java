package Tests;

import Algorithms.SubsequenceString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubsequenceStringTest {

    @Test
    void testSubsequenceString() {
        String s = "abc";
        String t = "abcde";

        SubsequenceString subsequenceString = new SubsequenceString();
        Assertions.assertTrue(subsequenceString.solution(s, t));
    }
}
