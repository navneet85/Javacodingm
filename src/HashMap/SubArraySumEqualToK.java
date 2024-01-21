package HashMap;

import java.util.HashMap;

public class SubArraySumEqualToK {
    public static void main(String[] args) {
      int arr[]={10,2,-2,-20,10};
      int k=-10;
      int sum=0;
      int ans=0;
      HashMap<Integer,Integer> hm=new HashMap<>();
      hm.put(0, 1);//we need to add this by default
      for(int j=0;j<arr.length;j++){
        sum=sum+arr[j];
          if(hm.containsKey(sum-k)){
            ans=ans+hm.get(sum-k);
          } else{
            hm.put(sum,hm.getOrDefault(sum,0)+1);
          }
      }
      System.out.println(ans);
    }
}
