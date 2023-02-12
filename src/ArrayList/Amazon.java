package ArrayList;

import java.util.*;

public class Amazon {
    public static void main(String[] args) {
    //int locations[]={1,2,5,7};
    //int movedFrom[]={2,5,7};
    //int movedTos[]={5,6,8};
    ArrayList<Integer> locations=new ArrayList<>();
    locations.add(1);
    locations.add(2);
    locations.add(4);
    locations.add(7);
    ArrayList<Integer> movedFrom=new ArrayList<>();
    movedFrom.add(2);
    movedFrom.add(4);
    movedFrom.add(7);
    ArrayList<Integer> movedTo=new ArrayList<>();
    movedTo.add(5);
    movedTo.add(6);
    movedTo.add(8);
    //Amazon code For sde:--movedFrom to movedTo
    ArrayList<Integer> al=new ArrayList<>(locations);
    ArrayList<Integer> newList=new ArrayList<>();
    newList.addAll(locations);
    al.retainAll(movedFrom);
    newList.removeAll(al);
    for(int i=0;i<movedFrom.size();i++){
        int c=movedFrom.get(i);
        int d=movedTo.get(i);
        if(al.contains(c)){
            al.remove(Integer.valueOf(c));
            al.add(d);
        }
    }
    newList.addAll(al);
    Collections.sort(newList);
    System.out.println(newList);
    }  
}
