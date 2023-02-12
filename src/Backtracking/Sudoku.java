package Backtracking;

public class Sudoku {
    public static boolean isSafe(int arr[][],int row ,int col,int digit){
        //for particular column
        for(int i=0;i<9;i++){
            if(arr[i][col]==digit){
                return false;
            }
        }
        //for particular row
        for(int i=0;i<9;i++){
            if(arr[row][i]==digit){
                return false;
            }
        }
        //grid- check
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(arr[i][j]==digit){
                   return false;
                }
            }
        }
        return true;
    }
    public static boolean sudoku(int arr[][],int row,int col){
        //base case
        if(row==9 && col==0){
            return true;
        }
        else if(row==9){
            return false;
        }

        //recursion
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        //for already placed
        if(arr[row][col]!=0){
            return sudoku(arr, nextRow, nextCol);
        }
        //for placing
        for(int digit=1;digit<=9;digit++){
            if(isSafe(arr,row,col,digit)){
               arr[row][col]=digit;
               if(sudoku(arr, nextRow,nextCol)){//soln exists
                 return true;
               }
               arr[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        sudoku(arr, 0, 0);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
