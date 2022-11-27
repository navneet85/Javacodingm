package Arrays;

public class PassAndReturnArray {
    public static int[] increase(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int p[]=increase(arr);
        System.out.println(p[4]);
    }
    
}
