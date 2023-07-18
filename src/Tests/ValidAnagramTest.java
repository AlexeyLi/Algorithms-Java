package Tests;

import Algorithms.ValidAnagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    @Test
    void testValidAnagram() {

        String s = "anagram";
        String t = "nagaram";

        ValidAnagram validAnagram = new ValidAnagram();

        Assertions.assertTrue(validAnagram.solution(s, t));
    }

    @Test
    void testIsAnagram() {

        String s = "anagram";
        String t = "nagaram";

        ValidAnagram validAnagram = new ValidAnagram();

        Assertions.assertTrue(validAnagram.isAnagram(s, t));
    }
}
