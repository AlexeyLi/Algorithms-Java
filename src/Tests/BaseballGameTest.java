package Tests;

import Algorithms.BaseballGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {

    @Test
    void testBaseballGame() {

        String[] operations = {"5","2","C","D","+"};
        int expectedResult = 30;

        BaseballGame baseballGame = new BaseballGame();
        int actualResult = baseballGame.solution(operations);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testBaseballGame2() {

        String[] operations = {"5","-2","4","C","D","9","+","+"};
        int expectedResult = 27;

        BaseballGame baseballGame = new BaseballGame();
        int actualResult = baseballGame.solution(operations);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testBaseballGame3() {

        String[] operations = {"1","C"};
        int expectedResult = 0;

        BaseballGame baseballGame = new BaseballGame();
        int actualResult = baseballGame.solution(operations);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
