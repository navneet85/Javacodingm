package Collections;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       //vector and its operation
       Vector<Integer> v=new Vector<>();
       for(int i=0;i<n;i++){
        v.addElement(sc.nextInt());
       }
       System.out.println(v);
       sc.close();
    }
}
