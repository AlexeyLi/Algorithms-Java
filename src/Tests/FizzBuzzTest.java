package Tests;

import Algorithms.FizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

    @Test
    void testFizzBuzz() {

        int n = 5;

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");

        List<String> actualresult = FizzBuzz.fizzBuzz(n);

        Assertions.assertEquals(expectedResult, actualresult);

    }

    @Test
    void testFizzBuzz15() {

        int n = 15;

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("7");
        expectedResult.add("8");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("11");
        expectedResult.add("Fizz");
        expectedResult.add("13");
        expectedResult.add("14");
        expectedResult.add("FizzBuzz");

        List<String> actualresult = FizzBuzz.fizzBuzz(n);

        Assertions.assertEquals(expectedResult, actualresult);

    }
}
