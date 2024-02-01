package DynamicProgramming;

import java.util.Arrays;

public class LongestCommomSequence {

    public static void main(String[] args) {
        String str1="AGGTAB";
        String str2="GXTXAYB";
        System.out.println(longestCommonSequence(str1,str2,0,0));
        int dp[][]=new int[str1.length()][str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(longestCommonSequenceMemo(str1,str2,0,0,dp));
        int dp2[][]=new int[str1.length()+1][str2.length()+1];
        System.out.println(longestCommonSequenceTab(str1,str2,str1.length(),str2.length(),dp2) );
    }

    public static int longestCommonSequence(String str1, String str2, int m, int n) {
        if(m==str1.length()||n==str2.length()){
            return 0;
        }
        
        if(str1.charAt(m)==str2.charAt(n)){
            return 1+longestCommonSequence(str1, str2, m+1, n+1);
        } else{
            return Math.max(longestCommonSequence(str1, str2, m, n+1),longestCommonSequence(str1, str2, m+1, n));
        }

    }
    public static int longestCommonSequenceTab(String str1, String str2, int m, int n,int dp[][]) {

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    dp[i][j]= 0;
                }
                
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                } else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        
        return dp[m][n];

    }
    public static int longestCommonSequenceMemo(String str1, String str2, int m, int n,int dp[][]) {
        if(m==str1.length()||n==str2.length()){
            return 0;
        }
        
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(str1.charAt(m)==str2.charAt(n)){
            dp[m][n]=1+longestCommonSequence(str1, str2, m+1, n+1);
            return dp[m][n];
        } else{
            dp[m][n]=Math.max(longestCommonSequence(str1, str2, m, n+1),longestCommonSequence(str1, str2, m+1, n));
            return dp[m][n];
        }

    }
}
