package ArrayList;
import java.util.*;
public class BasicOperation {
    public static void main(String[] args) {
        //////////////
        ArrayList<Integer> list=new ArrayList<>();
        /////O(1)
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        int a=list.get(2);
        System.out.println(list);
        System.out.println(a);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(12));
    }
}
