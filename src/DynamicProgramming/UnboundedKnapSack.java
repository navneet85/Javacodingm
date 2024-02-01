package DynamicProgramming;
//same as unboundedknapsack
public class UnboundedKnapSack {
    public static int unBoundedKnapSack(int val[],int wt[],int bag,int idx){
        if(bag==0){
            return 0;
        }
        if(idx==val.length){
            return 0;
        }
        if(wt[idx]<=bag){//valid case
            //include
           int ans1=val[idx]+unBoundedKnapSack(val, wt, bag-wt[idx], idx);
           //exclude
           int ans2=unBoundedKnapSack(val, wt, bag, idx+1);
           return Math.max(ans1,ans2);
        } else{
           return unBoundedKnapSack(val, wt, bag, idx+1);
        }

    }
    public static int unBoundedKnapSackMemo(int val[],int wt[],int bag,int idx,int dp[][]){
        if(bag==0){
            return 0;
        }
        if(idx==val.length){
            return 0;
        }
        if(dp[idx][bag]!=-1){
            return dp[idx][bag];
        }
        if(wt[idx]<=bag){//valid case
            //include
           int ans1=val[idx]+unBoundedKnapSackMemo(val, wt, bag-wt[idx], idx,dp);
           //exclude
           int ans2=unBoundedKnapSackMemo(val, wt, bag, idx+1,dp);
           dp[idx][bag]=Math.max(ans1,ans2);
           return dp[idx][bag];
        } else{
            dp[idx][bag]=unBoundedKnapSackMemo(val, wt, bag, idx+1,dp);
           return dp[idx][bag];
        }

    }
    public static int unBoundedKnapSackTab(int val[],int wt[],int bag){
           int dp[]=new int[bag+1];
           for(int i=0;i<=bag;i++){
             for(int j=0;j<val.length;j++){
                if(wt[j]<=i){
                   dp[i]=Math.max(dp[i],val[j]+dp[i-wt[j]]);
                }
             }
           }
           
           return dp[bag]; 
    }
    public static void main(String[] args) {
        int val[]={1,5,8,9,10,17,17,20};
        int wt[]={1,2,3,4,5,6,7,8};
        int bag=8;
        System.out.println(unBoundedKnapSack(val, wt, bag, 0));
        int dp[][]=new int[val.length+1][bag+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(unBoundedKnapSackMemo(val, wt, bag, 0, dp));
        System.out.println(unBoundedKnapSackTab(val,wt,bag));
    }
}
