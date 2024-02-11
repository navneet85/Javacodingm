package DynamicProgramming;

import java.util.Arrays;

public class Catalansnumber {
    public static void main(String[] args) {
        int n=4;
        System.out.println(catalanUsingRecur(n)); 
        //for memoization
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalanUsingMemo(n,dp)); 
        //for tabulation
        int dp2[]=new int[n+1];
        System.out.println(catalanUsingTab(n,dp2)); 


    }

    private static int catalanUsingTab(int n, int[] dp2) {
       dp2[0]=1;
       dp2[1]=1;
       for(int i=2;i<=n;i++){
          for(int j=0;j<=i-1;j++){
            dp2[i]+=dp2[j]*dp2[i-j-1];
          }
       }
       return dp2[n];
    }

    public static int catalanUsingMemo(int n, int[] dp) {
        //base case
        if(n==0||n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;//cn
        for(int i=0;i<n;i++){
           ans+=catalanUsingMemo(i,dp)*catalanUsingMemo(n-i-1,dp);
        }
        dp[n]=ans;
        return dp[n];
    }

    public static int catalanUsingRecur(int n) {
        //base case
        if(n==0||n==1){
            return 1;
        }
        int ans=0;//cn
        for(int i=0;i<n;i++){
           ans+=catalanUsingRecur(i)*catalanUsingRecur(n-i-1);
        }
        return ans;
    }
}
