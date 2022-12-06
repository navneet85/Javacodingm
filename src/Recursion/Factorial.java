package Recursion;
public class Factorial {
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void decrease(int n){
        if(n==1) {
            System.out.print(1);
            return;
        }
        else{
            System.out.print(n);
            decrease(n-1);
        }
    }
    public static void increase(int n){
        if(n==1) {
            System.out.print(1);
        }
        else{
            increase(n-1);
            System.out.print(n);   
        }
    }
    public static void main(String[] args) {
        System.out.println(Factorial.fact(3));
        //Factorial.decrease(10);
        Factorial.increase(10);
    }
}
