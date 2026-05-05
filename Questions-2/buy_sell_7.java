import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}

public class buy_sell_7 {
    public static void main(String[] args) {
        Solution obj = new Solution();

        // Sample Input
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}