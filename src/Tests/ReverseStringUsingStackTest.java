package Tests;

import Algorithms.ReverseStringUsingStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringUsingStackTest {

    @Test
    void testSolution() {

        String s = "Hello World!";
        String expectedResult = "!dlroW olleH";

        ReverseStringUsingStack reverseStringUsingStack = new ReverseStringUsingStack();
        String actualResult = reverseStringUsingStack.solution(s);

        Assertions.assertTrue(expectedResult.equals(actualResult));
    }
}
