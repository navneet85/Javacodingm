package Backtracking;

import Recursion.Factorial;

public class GridWays {
    public static int gridWays(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==n){
            return 0;
        }
        //kaam
        int w1=gridWays(i, j+1, n, m);
        int w2=gridWays(i+1, j, n, m);
        return w1+w2;
    }
    public static int gridWays(int n,int m){
        int p=Factorial.fact(n+m-2);
        int q=Factorial.fact(n-1);
        int r=Factorial.fact(m-1);
        return p/(q*r);
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(0, 0, n, m));
        System.out.println(gridWays(n, m));
    }
}
