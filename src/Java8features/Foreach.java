package Java8features;

import java.util.ArrayList;

public class Foreach {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        for(int x:arr){
            System.out.println(++x);
        }
        ArrayList<String> al=new ArrayList<>();
        //use of lambda expression
        al.add("bhg");
        al.add("bhc");
        al.add("bhd");
        al.add("bhm");
        al.forEach((n)->{System.out.println(n);});
    }
}
