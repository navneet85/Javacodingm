package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeProblem {
    // public static int minCoins(int coins[],int )

    public static int minCoinRequired(int coins[], int amt, int idx) {
        if (idx == coins.length || amt < 0) {
            return Integer.MAX_VALUE - 1;
        }
        if (amt == 0) {
            return 0;
        }
        return Math.min(1 + minCoinRequired(coins, amt - coins[idx], idx), minCoinRequired(coins, amt, idx + 1));

    }

    public static int minCoinRequiredTabulation(int coins[], int amt, int dp[][]) {

        int n = coins.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amt; j++) {
                if (i == 0) {
                    // Base case: if i is 0, use only the first coin
                    dp[i][j] = (j % coins[i] == 0) ? j / coins[i] : Integer.MAX_VALUE - 1;
                } else if (coins[i] > j) {
                    // If the current coin value is greater than the amount, skip it
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Choose the minimum of including and excluding the current coin
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i]]);
                }
            }
        }
        return dp[n - 1][amt];
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5, 11 };
        int amount = 15;
        System.out.println(minCoinRequired(coins, amount, 0));
        int dp[][] = new int[coins.length][amount + 1];
        System.out.println(minCoinRequiredTabulation(coins, amount, dp));

    }
}
