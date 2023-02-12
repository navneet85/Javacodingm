package ArrayList;

import java.util.ArrayList;

public class PairSumCode2 {
    //using modular approach for sorted and rotated array
    public static boolean checkSum(ArrayList<Integer> list,int target) {
        int breakingPoint=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
               breakingPoint=breakingPoint+i;
               break;
            }
        }
        int rp=breakingPoint;
        int lp=breakingPoint+1;
        while(lp!=rp){
            int m=list.get(lp);
            int n=list.get(rp);
            if(m+n==target){
                return true;
            }
            else if(m+n<target){
                lp=(lp+1)%list.size();
            }
            else{
                rp=(n+rp-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(checkSum(list, 25));
    }
}
