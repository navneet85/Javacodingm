package Recursion.Assignment;

public class ConverDigitToWord {
    static void convertDigitToWord(int n,String str){
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        str=arr[n%10]+str;
        convertDigitToWord(n/10,str);
    }
    public static void main(String[] args) {
        ConverDigitToWord.convertDigitToWord(1947,"");
    }
}
