package Tests;

import Algorithms.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    @Test
    void testValidParentheses() {

        String str = "()[]{}";

        ValidParentheses validParentheses = new ValidParentheses();

        Assertions.assertTrue(validParentheses.solution(str));
    }

    @Test
    void testValidParenthesesNegative() {

        String str = "(]";

        ValidParentheses validParentheses = new ValidParentheses();

        Assertions.assertFalse(validParentheses.solution(str));
    }

    @Test
    void test() {
        String str = "This month is march";

        ValidParentheses validParentheses = new ValidParentheses();

        int actualResult = validParentheses.test(str);
        int expectedResult = 4;

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
