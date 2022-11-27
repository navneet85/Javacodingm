package Arrays;

public class SubArrays {
    public static void printArrays(int arr[],int start,int end){
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                   printArrays(arr,i,j);
            }
            System.out.println();
        }
    }
}
