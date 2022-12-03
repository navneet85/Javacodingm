package String;

public class StringCompare {
    public static void main(String[] args) {
        String str1="Tony";
        String str2="Tony";
        String str3=new String("Tony");
        String str4=new String("Tony").intern();
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
    }
}
