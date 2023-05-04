package Tests;

import Algorithms.Cipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CipherTest {

    @Test
    void testCipher() {

        String s = "VTAOG";
        String expectedResult = "TRYME";

        Cipher cipher = new Cipher();
        String actualResult = cipher.solution(s);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
