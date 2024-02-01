package DynamicProgramming;

public class ZeroOneKnapsack {
    public static int zeroOneKnapSack(int val[],int wt[],int w,int idx){
        //base case
        if(w==0){
            return 0;
        }
        if(idx>val.length-1){
            return 0;
        }
        if(wt[idx]<=w){//valid
            //include
            int ans1=val[idx]+zeroOneKnapSack(val, wt, w-wt[idx], idx+1);
            //exclude
            int ans2=zeroOneKnapSack(val, wt, w, idx+1);
            return Math.max(ans1,ans2);
        } else{
            return zeroOneKnapSack(val, wt, w, idx+1);
        }
    }
    public static int zeroOneKnapSackMemonization(int val[],int wt[],int w,int idx,int dp[][]){
        //base case
        if(w==0){
            return 0;
        }
        if(idx>val.length-1){
            return 0;
        }
        if(dp[idx][w]!=-1){
            return dp[idx][w];
        }
        if(wt[idx]<=w){//valid
            //include
            int ans1=val[idx]+zeroOneKnapSack(val, wt, w-wt[idx], idx+1);
            //exclude
            int ans2=zeroOneKnapSack(val, wt, w, idx+1);
            dp[idx][w]=Math.max(ans1,ans2);
            return dp[idx][w];
        } else{
            dp[idx][w]=zeroOneKnapSack(val, wt, w, idx+1);
            return dp[idx][w];
        }
    }
    public static int zeroOneKnapSackTabulation(int val[],int wt[],int w,int dp[][]){
        for (int i = 0; i <= val.length; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i -1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
         return dp[val.length][w];
         
    }
  
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int bagWeight=7;
        int dp[][]=new int[val.length+1][bagWeight+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }

        int dp2[][]=new int[val.length+1][bagWeight+1];

        for(int i=0;i<dp2.length;i++){
            for(int j=0;j<dp2[0].length;j++){
                dp2[i][j]=-1;
            }
        }
        System.out.println(zeroOneKnapSack(val, wt, bagWeight, 0));
        System.out.println(zeroOneKnapSackMemonization(val, wt, bagWeight, 0,dp));
        System.out.println(zeroOneKnapSackTabulation(val, wt, bagWeight,dp2));

    }
}
