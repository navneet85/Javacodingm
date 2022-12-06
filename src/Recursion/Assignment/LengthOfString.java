package Recursion.Assignment;

public class LengthOfString {
    static int length(String str){
       //base
       if(str.length()==0) return 0;
       //
       return length(str.substring(1))+1;

    }
    public static void main(String[] args) {
        System.out.println( LengthOfString.length("Navneet"));
    }
}
