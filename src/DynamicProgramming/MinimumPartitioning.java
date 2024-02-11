package DynamicProgramming;

public class MinimumPartitioning {
    public static void main(String[] args) {
        int arr[]={1,6,11,5};
        minDiff(arr);
    }

    private static void minDiff(int[] arr) {
        int n=arr.length;
        
        int sum=0;
        for(Integer num:arr){
            sum=sum+num;
        }
        int wt=sum/2;
        int dp[][]=new int[n+1][wt+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=wt;j++){
                if(arr[i-1]<=j){//valid
                    dp[i][j]=Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
                } else {//invalid
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int sum1=dp[n][wt];
        int sum2=sum-sum1;
        System.out.println(Math.abs(sum2-sum1));
    }
}
