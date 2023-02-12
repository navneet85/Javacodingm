package DivideAndConquer;

import Arrays.PrintArray;

public class MergeSort {
    public static void mergeSort(int arr[],int si,int ei){
        //base condition
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;//si+ei/2 for mid we can use
        mergeSort(arr, si, mid);//for left part
        mergeSort(arr, mid+1, ei);//for right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
         int temp[]=new int[ei-si+1];
         int i=si;//idx for first sorted part
         int j=mid+1;//idx for 2nd sorted part
         int k=0;
         while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
         }
         //for leftover element of first sorted part
         while(i<=mid){
            temp[k++]=arr[i++];
         }
         //for leftover element of 2nd sorted part
         while(j<=ei){
            temp[k++]=arr[j++];
         }
         //copy temp[] to original array
         for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
         }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        PrintArray p=new PrintArray();
        p.print(arr);
    }
}
