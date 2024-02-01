package DynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;




public class LongestIncreasingSequence {
    public static void main(String[] args) {
        int arr[]={50,3,10,7,40,80};
        System.out.println(longestIncreasingSubsequence(arr,0,Integer.MIN_VALUE,0));
        int dp[]=new int[arr.length+1];
        Arrays.fill(dp,-1);
        System.out.println(longestIncreasingSubsequenceMemo(arr));

    }

    public static int longestIncreasingSubsequence(int[] arr, int idx, int prev,int count) {
        if(idx==arr.length){
            return 0;
        }
        int include=0;
        if(arr[idx]>prev){
            include= 1+longestIncreasingSubsequence(arr, idx+1, arr[idx],count+1);
        }
        return Math.max(include,longestIncreasingSubsequence(arr, idx+1, prev,count));
    }
    public static int longestIncreasingSubsequenceMemo(int[] arr) {
          HashSet<Integer> hs= new HashSet<>();
          for(int num:arr){
            hs.add(num);
          }
          int arr2[]=new int[hs.size()];
          int i=0;
          for(int num:hs){
            arr2[i]=num;
            i++;
          }
          Arrays.sort(arr2);
          return lis(arr,arr2);
    }

    public static int lis(int[] arr, int[] arr2) {
        int dp[][]=new int[arr.length+1][arr2.length+1];
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr2.length;j++){
                if(i==0||j==0){
                    dp[i][j]= 0;
                }
                
                else if(arr[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                } else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[arr.length][arr2.length];
        
    }
    
}
