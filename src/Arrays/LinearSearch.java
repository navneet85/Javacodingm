package Arrays;
import java.util.*;
public class LinearSearch {
    public static int searchLinearly(int arr[],int key){
          for(int i=0;i<arr.length;i++){
            if(key==arr[i])
            return i;
          }
          return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=searchLinearly(arr, 10);
        if(x!=-1){
            System.out.println("Element is at index:"+x);
        }
        else{
            System.out.println("Not Found");
        }
        sc.close();
    }
}
