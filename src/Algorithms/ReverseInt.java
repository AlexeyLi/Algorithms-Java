package Algorithms;

public class ReverseInt {

    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * Example 1:
     * Input: 123
     * Output: 321
     *
     * Example 2:
     * Input: -123
     * Output: -321
     *
     * Example 3:
     * Input: 120
     * Output: 21
     * Note:
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
     * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     */

    public static int reverseInt(int x) {
        int result = 0;
        while (x != 0) {
            int num = x % 10;
            x = x / 10;
            int temp = result * 10 + num;
            System.out.println(temp);
            System.out.println(num);
            System.out.println(result);
            System.out.println((temp - num) / 10);
            if ((temp - num) / 10 != result ) {
                return 0;
            }
            result = temp;
        }

        return result;
    }
}
