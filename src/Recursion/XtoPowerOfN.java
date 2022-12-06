package Recursion;

public class XtoPowerOfN {
    //Complexity Of order n
    static int xToPowerOfN(int x,int n){
        if(n==0) return 1;
       return x*xToPowerOfN(x, n-1);
    }
    //complexity of O(logn)
    static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }
        //return halfpowesqr if n is even 
        int halfpowersqr=optimizedPower(x, n/2)*optimizedPower(x, n/2);
        //if n is odd
        if(n%2!=0){
            return x*halfpowersqr;
        }
        return halfpowersqr;
    }
    public static void main(String[] args) {
        System.out.println(xToPowerOfN(5,3));
        System.out.println(optimizedPower(5,3));
    }
}
