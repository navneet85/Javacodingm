package Matrix;

public class SpiralMatrix {
    public static void Matrix(int arr[][]){
        int sr=0,sc=0,er=arr.length-1,ec=arr[0].length-1;
        while(sr<=er && sc<=ec){
            //top part
            for(int j=sc;j<=ec;j++){
                System.out.print(arr[sr][j]+" ");
            }
            //right part
            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }
            //bottom part
            for(int j=ec-1;j>=sc;j--){
                //to stop printing same number
                if(sr==er) break;
                System.out.print(arr[er][j]+" ");
            }
            //left part
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec) break;
                System.out.print(arr[i][sc]+" ");
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        Matrix(arr);
    }
}
