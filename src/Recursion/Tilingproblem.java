package Recursion;

public class Tilingproblem {
    static int noOfWays(int n){//for floor of size 2*n
        //Base case
        if(n==0||n==1) return 1;
        //For vertical choice
        int fnm1=noOfWays(n-1);
        //For Horizontal Choice
        int fnm2=noOfWays(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(Tilingproblem.noOfWays(3));
    }
}
