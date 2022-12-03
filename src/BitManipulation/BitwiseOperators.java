package BitManipulation;
import java.util.*;
public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter &,|,^,<<,>>");
        String str=sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(str){
            case "&":
                    System.out.println(a&b);
                    break;
            case "|":
                    System.out.println(a|b);
                    break;
            case "^":
                    System.out.println(a^b);
                    break;
            case "<<":
                    System.out.println(a<<b);
                    break;
            default:
                    System.out.println(a>>b);
        }
        sc.close();
    }
}
