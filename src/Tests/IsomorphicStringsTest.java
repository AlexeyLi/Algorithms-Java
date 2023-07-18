package Tests;

import Algorithms.IsomorphicStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsomorphicStringsTest {

    @Test
    void testIsomorphicStrings() {

        String s = "paper";
        String t = "title";

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }
}
