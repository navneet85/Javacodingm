package Arrays;

public class BinarySearch {

    public static int mid(int start,int end){
        return (start+end)/2;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int start=0,end=arr.length-1;
        int key=0;
        while(start<=end){
            int x=mid(start,end);
            if(arr[x]==key){
                System.out.println("Key found");
                break;
            }
            else if(arr[x]>key){
                end=x-1;
            }
            else{
                start=x+1;
            }
        }
        if(start>end){
            System.out.println("Not found");
        }

    }
    
}
