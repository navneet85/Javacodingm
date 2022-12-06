package Recursion;

public class FirstOccurence {
    static int firstOccurence(int arr[],int key,int i){
       if(i==arr.length-1) return -1;
       
       if(arr[i]==key) return i;
       return firstOccurence(arr, key, i+1);
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(FirstOccurence.firstOccurence(arr, 5, 0));
    }
    
}
