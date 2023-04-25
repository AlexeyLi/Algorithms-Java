package Algorithms;

// LeetCode 322.
/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.
 */

public class CoinChange {

    public int solution(int[] coins, int amount) {

        if (coins == null || coins.length == 0) {
            return -1;
        }

        int dp[] = new int[amount + 1];
        for (int i = 1; i <= amount; i++){
            int min = Integer.MAX_VALUE;
            for (int coin:coins){
                if (i - coin >= 0 && dp[i-coin] != -1)
                    min = dp[i-coin] < min ? dp[i-coin] :min;
            }
            // Set dp[i] to -1 if i (current amount) can not be reach by  coins array
            dp[i] = min == Integer.MAX_VALUE ? -1 : 1+min;
        }
        return dp[amount];
    }
    // Time: O(n)
    // Memory: O(n)
}
