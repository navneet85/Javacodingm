package Backtracking;

public class FindPermutations {
 public static void findPermutations(String str,String ans) {
    //base case
    if(str.length()==0){
        System.out.println(ans);
        return;
    }
    //backtracking
    for(int i=0;i<str.length();i++){
        char currChar=str.charAt(i);
        //abcde-if we want to remove c then "ab"+"de"
        String str1=str.substring(0, i)+str.substring(i+1);
        findPermutations(str1, ans+currChar);
    }
 }
   public static void main(String[] args) {
    String str="abc";
    findPermutations(str, "");
   } 
}
