package HashMap;

import java.util.LinkedHashMap;

import HashMap.HashMapImplementation.HashMap;

public class ItineraryFromTickets {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("chennai", "bengaluru");
        hm.put("mumbai","delhi");
        hm.put("goa","chennai");
        hm.put("delhi","goa");
        String keystart=getKey(hm);
        System.out.print(keystart);
        for(String key:hm.keySet()){
            System.out.print("->"+hm.get(keystart));
            keystart=hm.get(keystart);
        }


    }

    public static String getKey(HashMap<String, String> hm) {
     HashMap<String,String> evmap=new HashMap<>();
     for(String key:hm.keySet()){
        evmap.put(hm.get(key), key);
     }
     for(String key:hm.keySet()){
        if(!evmap.containsKey(key)){
            return key;
        } 
     }
     return null;

    }
}
