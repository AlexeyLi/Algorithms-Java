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
}
