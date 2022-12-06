package Recursion;

public class NthFibo {
    static int nthFibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return nthFibo(n-1)+nthFibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(nthFibo(5));
    }
}
