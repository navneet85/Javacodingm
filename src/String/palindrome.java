package String;

public class palindrome {
    public static void main(String[] args) {
        String str="abederba";
    //     String str2="";
    //     for(int i=str.length()-1;i>=0;i--){
    //        str2=str2+str.charAt(i);
    //     }
    //    System.out.println(str2.equals(str));
    boolean be=true;
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt((str.length()-1)-i)){
            be=false;
        }
    }
    if(be){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
    }
}
