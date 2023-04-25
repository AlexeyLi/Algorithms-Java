package Tests;

import Algorithms.ProductExceptSelf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductExceptSelfTest {

    @Test
    void testProductExceptSelf() {

        int[] nums = {1, 2, 3, 4};
        int[] expectedResult = {24, 12, 8, 6};

        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] actualResult = productExceptSelf.solution(nums);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
