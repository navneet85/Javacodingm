package Java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(5);
        List<Integer> newl=al.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(newl);
        List<Integer> newll=newl.stream().distinct().collect(Collectors.toList());
        System.out.println(newll);
        List<Integer> newlll=newll.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(newlll);
    }
}
