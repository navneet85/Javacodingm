package ArrayList;

import java.util.ArrayList;
public class Infosys2 {
    public static void main(String[] args) {
       ArrayList<Integer> al=new ArrayList<>();
       al.add(12);
       al.add(12);
       long a1=al.get(0);
       System.out.println(a1==al.get(1));
    }
}
