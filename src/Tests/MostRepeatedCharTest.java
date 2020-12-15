package Tests;

import Algorithms.MostRepeatedChar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MostRepeatedCharTest {

    @Test
    void mostRepeatedCharTest() {
        String str = "Hello World";
        Character expectedResult = 'l';
        Character actualResult = MostRepeatedChar.mostRepeatedChar(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
