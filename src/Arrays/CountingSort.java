package Arrays;

public class CountingSort {
    public static void CSort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int countarr[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            countarr[arr[i]]++;
        }
        int p=0;
        for(int i=0;i<countarr.length;i++){
            while(countarr[i]>0){
                arr[p]=i;
                countarr[i]--;
                p++;
            }
        }
        PrintArray po=new PrintArray();
        po.print(arr);
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        CSort(arr);
        
    }
}
