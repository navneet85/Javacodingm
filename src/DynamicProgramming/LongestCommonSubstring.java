package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="abc";
        System.out.println(longestCommonSubstring(str1,str2,0,0,0));
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(longestCommonSubstringMemo(str1,str2,0,0,0,dp) );
        int dp2[][]=new int[str1.length()+1][str2.length()+1];
        System.out.println(longestCommonSubstringTab(str1,str2,str1.length(),str2.length(),dp2));
    }

    public static int longestCommonSubstring(String str1, String str2, int i, int j,int count) {
        if(i==str1.length()||j==str2.length()){
            return count;
        }
        if(str1.charAt(i)==str2.charAt(j)){
            count= longestCommonSubstring(str1, str2, i+1, j+1, count+1);
        } 
        count=Math.max(count,Math.max(longestCommonSubstring(str1, str2, i+1, j, 0),longestCommonSubstring(str1, str2, i, j+1, 0)));
        return count;
    }
    public static int longestCommonSubstringMemo(String str1, String str2, int i, int j,int count,int dp[][]) {
        if(i==str1.length()||j==str2.length()){
            return count;
        }
        if(str1.charAt(i)==str2.charAt(j)){
            count= longestCommonSubstring(str1, str2, i+1, j+1, count+1);
        } 
        count=Math.max(count,Math.max(longestCommonSubstring(str1, str2, i+1, j, 0),longestCommonSubstring(str1, str2, i, j+1, 0)));
        dp[i][j]=count;
        return dp[i][j];
        
    }
    public static int longestCommonSubstringTab(String str1, String str2,int m,int n,int dp[][]) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }
}
