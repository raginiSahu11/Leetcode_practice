import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int ts = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                ts += prices[i] - prices[i - 1];
            }
        }

        return ts;
    }
}

public class max_buy_sell_8 {
    public static void main(String[] args) {
        Solution obj = new Solution();

        // Sample Input
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = obj.maxProfit(prices);

        System.out.println("Total Profit: " + result);
    }
}