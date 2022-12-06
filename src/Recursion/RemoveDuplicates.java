package Recursion;

public class RemoveDuplicates {
    // static boolean map(int i,boolean arr[]){
    //     if(arr[i]==false){
    //       arr[i]=true;
    //       return false;
    //     }
    //     else{
    //         return true;
    //     }
    // }
    // static String bruteforce(String str){
    //     String str1="";
    //     boolean arr[]=new boolean[26];
    //     for(int i=0;i<str.length();i++){
    //         int p=str.charAt(i)-'a';
    //         if(!map(p,arr)){
    //              str1=str1+str.charAt(i);
    //         }
    //     }
    //     return str1;
    // }
    static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        //Base Condition
        if(idx==str.length()-1) {
            System.out.println(newstr);
            return;
        }
        //kaam
        char currentchar=str.charAt(idx);
        if(map[currentchar-'a']){
            removeDuplicates(str, idx+1, newstr, map);
        }
        else{
            map[currentchar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currentchar), map);
        }

    }
    public static void main(String[] args) {
        String str="appnnacollege";
        //System.out.println(RemoveDuplicates.bruteforce(str));
        RemoveDuplicates.removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
    };
}
