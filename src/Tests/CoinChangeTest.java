package Tests;

import Algorithms.CoinChange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {

    @Test
    void testCoinChange() {

        int[] coins = {1, 2, 5};
        int amount = 11;
        int expectedResult = 3;

        CoinChange coinChange = new CoinChange();
        int actualResult = coinChange.solution(coins, amount);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
