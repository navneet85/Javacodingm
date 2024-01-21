package HashMap;

import java.util.HashSet;

public class ArrayUnionIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> hs=new HashSet<>();
        for(int num:arr1){
           hs.add(num);
        }
        for(int num:arr2){
           hs.add(num);
        }
        System.out.println(hs);//it will give union of two set
        //for intersection
        hs.clear();
        for(int num:arr1){
           hs.add(num);
        }
        int count=0;
        for(int num:arr2){
           if(hs.contains(num)){
              count=count+1;
              hs.remove(num);
           }
        }
        System.out.println(count);//it will give us intersection

    }
}
