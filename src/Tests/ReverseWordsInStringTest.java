package Tests;

import Algorithms.ReverseWordsInString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsInStringTest {

    @Test
    void reverseSentenceTest() {
        String sentence = "i live in a house";
        String expectedResult = "house a in live i";
        ReverseWordsInString reverseSentence = new ReverseWordsInString();
        String actualResult = reverseSentence.reverseWordsInString(sentence);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
