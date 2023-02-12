package Arrays;

public class SlowFast {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int slow=0;
        int fast=0;
        while(fast+2<arr.length){
           slow=slow+1;
           fast=fast+2;
        }
        System.out.println(arr[slow]);
    }
}
