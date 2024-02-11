package DynamicProgramming;

import java.util.Arrays;

public class MinimumArrayJumps {
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        minArrayJump(arr);
    }

    private static void minArrayJump(int[] arr) {
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int step=arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+step&&j<n;j++){
                if(dp[j]!=-1){
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE){
                dp[i]=ans;
            }
        }
        System.out.println(dp[0]);
    }
}
