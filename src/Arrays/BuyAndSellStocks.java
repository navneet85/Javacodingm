package Arrays;
public class BuyAndSellStocks {
    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        int bp=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
             if(prices[i]>bp){
                 int profit=prices[i]-bp;
                 maxProfit=Math.max(maxProfit, profit);
             }
             else{
                bp=prices[i];
             }
        }
        System.out.println(maxProfit);
    }
}
