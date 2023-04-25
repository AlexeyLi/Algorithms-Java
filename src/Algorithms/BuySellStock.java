package Algorithms;

// LeetCode 121.
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class BuySellStock {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return -1;
        }

        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = maxProfit < prices[right] - prices[left]? prices[right] - prices[left]: maxProfit;
            } else {
                left = right;
            }

            right += 1;
        }
        return maxProfit;
    }
    // Time: O(n)
    // Memory: O(1)
}
