package ArrayList;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(7);
        list3.add(8);
        ArrayList<Integer> list4=new ArrayList<>();
        list4.add(7);
        list4.add(8);
        list4.add(8);
        list4.add(8);
        ArrayList<Integer> list5=new ArrayList<>();
        list5.add(7);
        list5.add(8);
        list5.add(7);
        list5.add(8);
        list5.add(7);
        list5.add(8);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
        int n=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            n=Math.max(n, list.get(i).size());
        }
        for(int i=0;i<n;i++){
            int p=0;
           while(p<list.size()){
              if(i<list.get(p).size()){
                System.out.print(list.get(p).get(i)+" ");
              }
              p++;
           }
        }
    }
}
