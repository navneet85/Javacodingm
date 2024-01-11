package HashMap;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2=sc.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        boolean isAnagram=false;
        for(int i=0;i<str.length();i++){
            // if(hm.containsKey(str.charAt(i))){
            //    hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            // } else{
            //     hm.put(str.charAt(i), 1);
            // }
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++){
            if(hm.containsKey(str2.charAt(i))){
               if(hm.get(str2.charAt(i))==1){
                 hm.remove(str2.charAt(i));
               } else{
                 hm.put(str.charAt(i), hm.get(str.charAt(i))-1);
               }
            } 
        }
        System.out.println(hm);
        if(hm.isEmpty()){
            isAnagram=true;
        }
        System.out.println(isAnagram);
    }
}
