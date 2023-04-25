package Tests;

import Algorithms.BuySellStock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuySellStockTest {

    @Test
    void testBuySellStock() {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int expectedResult = 5;

        BuySellStock buySellStock = new BuySellStock();
        int actualResult = buySellStock.maxProfit(nums);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
