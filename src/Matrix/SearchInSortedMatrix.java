package Matrix;

public class SearchInSortedMatrix {
    public static boolean search(int arr[][],int key){
        int row=0,col=arr[0].length-1;
        while(row>=0 && col>=0){
            if(key==arr[row][col]){
                System.out.println("Element is at row="+(row+1)+" and at column="+(col+1) );
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("Element not found ");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20}};
        search(arr,16);
    }
}
