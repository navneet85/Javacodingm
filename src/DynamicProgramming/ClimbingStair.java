package DynamicProgramming;

public class ClimbingStair {
    public static int climbRecursion(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return climbRecursion(n-1)+climbRecursion(n-2);
    }
    public static int climbRecursionUsingmemoization(int n,int dp[]){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=climbRecursionUsingmemoization(n-1,dp)+climbRecursionUsingmemoization(n-2,dp);
        return dp[n];
    }
    public static int climbRecursionUsingTabulation(int n,int dp[]){
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbRecursion(5));
        int dp[]=new int[n+1];
        int dp2[]=new int[n+1];
        System.out.println(climbRecursionUsingmemoization(n,dp));
        System.out.println(climbRecursionUsingTabulation(n,dp2));
    }
}
