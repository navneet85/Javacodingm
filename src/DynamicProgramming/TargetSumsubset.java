package DynamicProgramming;

import java.util.HashMap;

public class TargetSumsubset {
    public static boolean isSubsetPossible(int num[],int sum,int idx){
       //base case
       if(idx>num.length-1){
         return false;
       }
       if(sum==0){
        return true;
       }
       //choices
       return isSubsetPossible(num, sum-num[idx], idx+1)||isSubsetPossible(num, sum, idx+1);
    }
    public static boolean isSubsetPossibleMemo(int num[],int sum,int idx,HashMap<String,Boolean> hm){
        //base case
        if(idx>num.length-1){
          return false;
        }
        if(sum==0){
         return true;
        }
        String key=sum+":"+idx;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        //choices
        boolean result=isSubsetPossibleMemo(num, sum-num[idx], idx+1, hm) ||isSubsetPossibleMemo(num, sum, idx+1, hm);
        hm.put(key,result);
        return result;

     }
     public static boolean isSubsetPossibleTabulation(int num[],int sum,int idx){
        boolean dp[][]=new boolean[idx+1][sum+1];
        //basr case
        for(int i=0;i<=idx;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<=idx;i++){
            for(int j=1;j<=sum;j++){
               if(num[i-1]<=j){
                dp[i][j]=dp[i-1][j]||dp[i-1][j-num[i-1]];
               }else{
                dp[i][j]=dp[i-1][j];
               }
            }
        }
        return dp[idx][sum];
     }
    public static void main(String[] args) {
        int num[]={4,2,7,1,3};
        int target_Sum=6;
        System.out.println(isSubsetPossible(num, target_Sum, 0));
        HashMap<String,Boolean> hm=new HashMap<>();
        System.out.println(isSubsetPossibleMemo(num, target_Sum, 0,hm));
        System.out.println(isSubsetPossibleTabulation(num, target_Sum, num.length));

    }
}
