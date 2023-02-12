package ArrayList;

import java.util.ArrayList;

public class ContainerWithMW {
    public static int storeWater(ArrayList<Integer> list){
      int max=Integer.MIN_VALUE;
      int lp=0;
      int rp=list.size()-1;
      while(lp<rp){
        int height=Math.min(list.get(lp),list.get(rp));
        int width=rp-lp;
        max=Math.max(max,height*width);
        if(list.get(lp)<list.get(rp)){
            lp++;   
        }
        else{
            rp--;
        }
      }
      return max;
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        // //////////bruteforce//////////////
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         int height=Math.min(arr[i], arr[j]);
        //         int width=j-i;
        //         max=Math.max(max, width*height);
        //     }
        // }
        // System.out.println(max);
        ///////////////bruteforce////////////
     /////////pointer////////////
     ArrayList<Integer> list=new ArrayList<>();
     for(int i=0;i<arr.length;i++){
        list.add(arr[i]);
     }
     System.out.println(list);
     System.out.println(storeWater(list));
    }
}
