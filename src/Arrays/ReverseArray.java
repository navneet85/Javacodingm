package Arrays;

public class ReverseArray {
    public static void reverseArray(int arr[]){
        int first =0,last=arr.length-1;
        while(first<last){
            int c=arr[first];
            arr[first]=arr[last];
            arr[last]=c;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<=arr.length/2;i++){
            int c=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=c;
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        reverseArray(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }
}
