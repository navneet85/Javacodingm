package Arrays.Assignment;

public class Distinct {
    public static boolean checkForDistinct(int arr[]){
         for(int i=0;i<arr.length;i++){
              int p=arr[i],count=0;
              for(int j=0;j<arr.length;j++){
                if(p==arr[j]) count++;
              }
              if(count==2)return true;
         }
         
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4};
        System.out.println(checkForDistinct(arr));

    }
}
