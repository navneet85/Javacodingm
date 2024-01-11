package HashMap;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
       int nums[]={1,3,2,5,1,3,1,5,1} ;
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(Integer num:nums){
         if(hm.containsKey(num)){
            
            Integer count=hm.get(num);
            count++;
            hm.put(num, count);
         } else{
            hm.put(num, 1);
         }
       }
       System.out.println(hm);
       Set<Integer> s=hm.keySet();
       int count=0;
       for(Integer num:s){
         if(hm.get(num)>nums.length/3){
            //hm.remove(num);
            count=count+1;
         }
       }
       System.out.println(count);
    }
}
