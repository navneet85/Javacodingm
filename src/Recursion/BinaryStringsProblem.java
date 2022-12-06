package Recursion;

public class BinaryStringsProblem {
    static void printBinString(int n,int lastplace,String str ){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //passing 0
        printBinString(n-1, 0, str+"0");
        //passing 1
        if(lastplace==0){
        printBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        BinaryStringsProblem.printBinString(3, 0, "");
    }
}
