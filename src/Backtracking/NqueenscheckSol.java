package Backtracking;

public class NqueenscheckSol {
    public static boolean nQueens(char board[][],int row) {
        //base case
        if(row==board.length){
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
              //for settling the queen
              board[row][j]='Q';
              if(nQueens(board, row+1)){
                return true;
              }
              //backtracking line
              board[row][j]='X';
            }
            
        }
        return false;
    }
    public static boolean isSafe(char board[][],int row,int col) {
        //for vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonally up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonally up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printArr(char board[][]) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             board[i][j]='X';
         }
        }
        if(nQueens(board, 0)){
            printArr(board);
        }
        else{
            System.out.println("no solution");
        }
    }
}
