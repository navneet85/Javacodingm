package DynamicProgramming;
//same as catalansnumber
public class MountainRanges {
    public static void main(String[] args) {
        int n=4;
        mountainAndValley(n);
    }

    private static void mountainAndValley(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        System.out.println(dp[n]);
    }
}
