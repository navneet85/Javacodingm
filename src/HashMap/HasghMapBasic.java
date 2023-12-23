package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HasghMapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("India",100);
        hs.put("Srilanka",56);
        hs.put("China",150);
        hs.put("Nepal",50);
        //iterate  
        Set<String> keys=hs.keySet();
        for (String str : keys) {
            System.out.println(hs.get(str));
        }
    }
}
