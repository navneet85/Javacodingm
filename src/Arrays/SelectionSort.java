package Arrays;
public class SelectionSort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min_index]){
                min_index=j;
               }
           }
           int c=arr[i];
           arr[i]=arr[min_index];
           arr[min_index]=c;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,25,12,22,11};
        sort(arr);
        PrintArray p=new PrintArray();
        p.print(arr);
    }
}
