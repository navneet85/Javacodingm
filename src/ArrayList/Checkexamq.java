package ArrayList;

import java.util.HashSet;

public class Checkexamq {
    public static void main(String[] args) {
        String str="abcadeedacba";
        HashSet<Character> hs= new HashSet<Character>(); 
        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));
        }
        System.out.println(hs);
        for(int i=0;i<hs.size();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(hs.contains(str.charAt(i))){
                  count=count+1;
                }
            }
        }
    }
}
