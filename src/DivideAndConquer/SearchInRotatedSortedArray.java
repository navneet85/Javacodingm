package DivideAndConquer;

public class SearchInRotatedSortedArray {
    public static int search(int arr[],int si,int ei,int target){
        int mid=si+(ei-si)/2;
        //base case
        if(si>ei){
            return -1;
        }
        //mid on mid
        if(target==arr[mid]){
            return mid;
        }
        //mid on L1
        if(arr[si]<arr[mid]){
            //case a
            if(target>=arr[si] && target<=arr[mid]){
                return search(arr, si, mid, target);
            }
            //case b
            else{
                return search(arr, mid+1, ei, target);
            }
        }
        //mid on L2
        else{
            //case a
            if(target>=arr[mid] && target<=arr[ei]){
                return search(arr, mid, ei, target);
            }
            //case b
            else{
                return search(arr, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int idx=search(arr,0,arr.length-1,target);
        System.out.println(idx);
    }
}
