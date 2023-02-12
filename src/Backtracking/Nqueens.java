package Backtracking;

public class Nqueens {
    public static void nQueens(char board[][],int row) {
        //base case
        if(row==board.length){
            System.out.println("-------------");
            count++;
            printArr(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
              //for settling the queen
              board[row][j]='Q';
              nQueens(board, row+1);
              //backtracking line
              board[row][j]='X';
            }
        }
        
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
    static int count=0;
    public static void main(String[] args) {
       int n=4;
       char board[][]=new char[n][n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='X';
        }
       }
       nQueens(board, 0);
       System.out.println(count);
    }
}
