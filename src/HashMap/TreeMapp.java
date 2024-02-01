package HashMap;
import java.util.*;

public class TreeMapp {
    public static void main(String[] args) {
        TreeMap<String,Integer> tmp=new TreeMap<>();
        tmp.put("India",20);
        tmp.put("China",30);
        tmp.put("America", 10);
        System.out.println(tmp.get("India"));
    }
}
