package Backtracking;

import Arrays.PrintArray;

public class MaxPoint {
    public static void main(String[] args) {
        int n=5;
        int points1[]={1,3,4,4,5};
        int x=2,y=2;
        int p=0;
        String arr[]=new String[25];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               arr[p]=i+","+j;
               p++;
               
            }
        }
        PrintArray p1=new PrintArray();
        p1.print(arr);
    }
}
