package Arrays;

public class Unique {

    public static void main(String[] args) {
        String str="asd frr eeee www sed";
        boolean brr[]=new boolean[26];
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i)-'a';
            brr[ch]=true;
            if(check(ch,brr)){

            }
        }
    }

    private static boolean check(int ch, boolean[] brr) {
        return brr[ch];
    }
}
