package String;
import java.util.*;
public class ConvertFirstToUppercase {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       StringBuffer sb=new StringBuffer();
       sb.append(Character.toUpperCase(s.charAt(0)));
       for(int i=1;i<s.length();i++){
         if(s.charAt(i)==' '){
            Character ch=Character.toUpperCase(s.charAt(i+1));
            sb.append(" "+ch);
            i++;
         }
         else{
            sb.append(s.charAt(i));
         }
       }
       System.out.println(sb.toString()); 
       sc.close();
    }
}
