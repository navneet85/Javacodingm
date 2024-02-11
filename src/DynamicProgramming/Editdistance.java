package DynamicProgramming;

public class Editdistance {
    public static void main(String[] args) {
        String str1 = "intention";
        String str2 = "execution";
        int dp[][] = new int[str1.length() + 1][str2.length() + 1];
        System.out.println(editDistanceUsingTab(str1, str2, str1.length(), str2.length(), dp));
    }

    private static int editDistanceUsingTab(String str1, String str2, int m, int n, int dp[][]) {
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int add=dp[i][j - 1] + 1;
                    int del=dp[i - 1][j] + 1;
                    int rep=dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(add, Math.min(del,rep));
                }
            }
        }
        return dp[m][n];
    }
}
