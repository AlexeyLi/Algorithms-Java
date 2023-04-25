package Tests;

import Algorithms.SimplifyPath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimplifyPathTest {

    @Test
    void testClimbStairs() {
        int n = 5;
        int expectedResult = 8;

        SimplifyPath simplifyPath = new SimplifyPath();
        int actualResult = simplifyPath.climbStairs(n);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testClimbStairsFibonacci() {
        int n = 5;
        int expectedResult = 8;

        SimplifyPath simplifyPath = new SimplifyPath();
        int actualResult = simplifyPath.climbStairsFibonacci(n);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
