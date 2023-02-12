package ArrayList;
import java.util.*;
public class Sorting {
    public static void main(String args[]) {
      int arr[]={1,0,0,1,2,0,1,0};
      int left=0;
      int right=arr.length-1;
      ArrayList<Integer> li=new ArrayList<>();
      ArrayList<Integer> lni=new ArrayList<>();
      while(left<=right){
          if(arr[left]==0 && arr[right]==0){
              li.add(0);
              li.add(0);
          }
          else if(arr[left]==0 || arr[right]==0 ){
              li.add(0);
          }
          left++;right--;
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
              lni.add(arr[i]);
          }
      }
      //li.addAll(lni);
      System.out.println(li);
      Collections.sort(lni,Collections.reverseOrder());
      li.addAll(lni);
      System.out.println(li);
    }
    ////
}
