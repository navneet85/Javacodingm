package DynamicProgramming;

import java.util.Arrays;

public class MatrixChainMultiPlication {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int start=1;
        int end=arr.length-1;
        System.out.println(minCost(arr,start,end));
        //memoization
        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(minCostMemo(arr,start,end,dp));
        //tabulation
        int dp2[][]=new int[arr.length][arr.length];
        System.out.println(minCostTab(arr,dp2));

    }

    private static int minCostTab(int[] arr,int[][] dp) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }
        for(int len=2;len<=n-1;len++){
            for(int i=1;i<=n-len;i++){
                int j=i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1=dp[i][k];
                    int cost2=dp[k+1][j];
                    int cost3=arr[i-1]*arr[k]*arr[j];
                    dp[i][j]=Math.min(dp[i][j],cost1+cost2+cost3);
                }
            }
        }
        return dp[1][arr.length-1];
    }

    private static int minCost(int[] arr, int start, int end) {
        //base case
        if(start==end){
           return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=start;k<end;k++){
            int cost1=minCost(arr, start, k);
            int cost2=minCost(arr, k+1, end);
            //resultant matrix of cost1 have a=arr[start-1]*arr[k];
            //resultant matrix of cost2 have a=arr[k]*arr[end];
            //Ai=arr[i-1]*arr[i];

            int cost3=arr[start-1]*arr[k]*arr[end];
            ans=Math.min(ans,cost1+cost2+cost3);
        }
        return ans;
    }
    private static int minCostMemo(int[] arr, int start, int end,int dp[][]) {
        //base case
        if(start==end){
           return 0;
        }
        if(dp[start][end]!=-1){
            return dp[start][end];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=start;k<end;k++){
            int cost1=minCostMemo(arr, start, k,dp);
            int cost2=minCostMemo(arr, k+1, end,dp);
            //resultant matrix of cost1 have a=arr[start-1]*arr[k];
            //resultant matrix of cost2 have a=arr[k]*arr[end];
            //Ai=arr[i-1]*arr[i];

            int cost3=arr[start-1]*arr[k]*arr[end];
            ans=Math.min(ans,cost1+cost2+cost3);
            

        }
        return dp[start][end]=ans;
    }
}
