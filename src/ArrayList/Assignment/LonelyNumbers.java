package ArrayList.Assignment;
import java.util.*;
public class LonelyNumbers {
    public static void count(ArrayList<Integer> list,int count[]){
      for(int i=0;i<list.size();i++){
        int p=list.get(i);
        for(int j=0;j<list.size();j++){
            if(p==list.get(j)){
                count[i]=count[i]+1;
            }
        }
      }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int count[]=new int[list.size()];
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(list);
        count(list, count);
        System.out.println(count[0]);
    }
}
