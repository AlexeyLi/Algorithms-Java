package Tests;

import Algorithms.ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {

    @Test
    void testContainsDuplicate() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        Assertions.assertTrue(containsDuplicate.solution(nums));
    }

    @Test
    void testContainsDuplicateNegative() {
        int[] nums = {1, 2, 3, 4};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        Assertions.assertFalse(containsDuplicate.solution(nums));
    }
}
