package DivideAndConquer.Assignment;

public class MajorityElementCode {
    public static int majority(int arr[],int si,int ei){
      //base case
      if(si==ei){
        return arr[si];
      }
      int mid=si+(ei-si)/2;
      int left=majority(arr, si, mid);
      int right=majority(arr, mid+1, ei);
    }
    public static int count
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,1,1,1};
    }
}
