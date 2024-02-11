package DynamicProgramming;
//tc=o(m*n)
public class WildCardMatching {
    public static void main(String[] args) {
        String str="baaabab";
        String pattern="*****ba*****ab";
        System.out.println(isMatch(str,pattern)); 
    }

    public static boolean isMatch(String str, String pattern) {
        int n=str.length();
        int m=pattern.length();
        boolean dp[][]=new boolean[n+1][m+1];
        //initialize
        dp[0][0]=true;
        //match will be false if pattern is 0
        //pattern=" "
        for(int i=1;i<=n;i++){
            dp[i][0]=false;
        }
        //str=" " for empty string
        for(int j=1;j<=m;j++){
            if(pattern.charAt(j-1)=='*'){
               dp[0][j]=dp[0][j-1];
            }
        }
        //bottom up approach
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str.charAt(i-1)==pattern.charAt(j-1)||pattern.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                } else if(pattern.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-1]||dp[i-1][j];
                } else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }
}
