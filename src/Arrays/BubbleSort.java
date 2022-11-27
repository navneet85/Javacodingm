package Arrays;

public class BubbleSort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2,10};
        sort(arr);
        PrintArray p=new PrintArray();
        p.print(arr);
    }
}
