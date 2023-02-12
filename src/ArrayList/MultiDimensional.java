package ArrayList;
import java.util.*;
public class MultiDimensional {
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
      list.add(12);
      list.add(13);
      list.add(14);
      ArrayList<Integer> list2=new ArrayList<>();
      list2.add(10);
      list2.add(11);
      list2.add(13);
      list2.add(15);
      ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
      mainList.add(list);
      mainList.add(list2);
      System.out.println(mainList);
      ///////iterating over ArrayList
      for(int i=0;i<mainList.size();i++){
        ArrayList<Integer> currlist=new ArrayList<>();
        currlist=mainList.get(i);
        for(int j=0;j<currlist.size();j++){
            System.out.print(currlist.get(j)+" ");
        }
        System.out.println();
      }
    }
}
