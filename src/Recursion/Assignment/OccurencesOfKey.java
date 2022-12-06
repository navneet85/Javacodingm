package Recursion.Assignment;

public class OccurencesOfKey {
    static void printOccurences(int arr[],int key,int i){
        if(i==arr.length-1){
            return;
        }
        if(key==arr[i]){
            System.out.println(i+" ");
        }
        printOccurences(arr, key, i+1);
    } 
    public static void main(String[] args) {
        int arr[]={1,1,2,1,1,3,4,5};
        OccurencesOfKey.printOccurences(arr, 1, 0);
    }
}
