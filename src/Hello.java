import java.util.*;
public class Hello{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n*n);
        App1 ap=new App1();
        System.out.println(ap.n);
        sc.close();
    }
}