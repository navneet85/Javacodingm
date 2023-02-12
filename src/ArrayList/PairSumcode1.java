package ArrayList;

import java.util.ArrayList;

public class PairSumcode1 {
    public static boolean checkSum(ArrayList<Integer> list,int target){
        //2pointer approach
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            int m=list.get(lp);
            int n=list.get(rp);
            if(m+n==target){
                return true;
            }
            else if(m+n<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        int target=29;
        System.out.println(checkSum(list, target));
    }
}
