package Tests;

import Algorithms.PrimeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    PrimeNumber primeNumber = new PrimeNumber();

    @Test
    void testIsPrimeNumber() {
        int n = 17;
        Assertions.assertTrue(primeNumber.isPrime(n));
    }

    @Test
    void testIsPrimeOne() {
        int n = 1;
        Assertions.assertFalse(primeNumber.isPrime(n));
    }

    @Test
    void testPrimeFalse() {
        int n = 36;
        Assertions.assertFalse(primeNumber.isPrime(n));
    }
}
