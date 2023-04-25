package Tests;

import Algorithms.RemoveStarsFromString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveStarsFromStringTest {

    @Test
    void testRemoveStarsFromString() {
        String s = "leet**cod*e";

        String expectedResult = "lecoe";
        RemoveStarsFromString removeStarsFromString = new RemoveStarsFromString();
        String actualResult = removeStarsFromString.solution(s);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void testRemoveStarsFromStringSolutionStack() {
        String s = "erase*****";

        String expectedResult = "";
        RemoveStarsFromString removeStarsFromString = new RemoveStarsFromString();
        String actualResult = removeStarsFromString.solutionStack(s);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
