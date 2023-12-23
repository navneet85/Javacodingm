package String;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MaxOccurence {
    public static void main(String[] args) {
        String arr[]={"monika","monika","menka","mwtal","menka","monika","monika","mohit"};
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                continue;
            }
            int count=0;
            for(int p=i;p<arr.length;p++){
                if(arr[i]==arr[p]){
                    count=count+1;
                }
            }
            hs.put(arr[i], count);
        }
        for (Map.Entry<String, Integer> set :
             hs.entrySet()) {
            System.out.println(set.getKey() + " = "
                               + set.getValue());
        }

        List<Map.Entry<String, Integer> > list
            = new LinkedList<Map.Entry<String, Integer> >(
                hs.entrySet());
 
        Collections.sort(
            list,
            (i1,
             i2) -> i1.getValue().compareTo(i2.getValue()));
 
        HashMap<String, Integer> temp
            = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }






    }
}
