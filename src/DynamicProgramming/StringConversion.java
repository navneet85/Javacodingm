package DynamicProgramming;

public class StringConversion {
    public static void main(String[] args) {
        String str1="abcdef";
        String str2="bdeg";
        LongestCommomSequence ls=new LongestCommomSequence();
        int lcsLength=ls.longestCommonSequence(str1,str2,0,0);
        System.out.println((str1.length()- lcsLength)+(str2.length()-lcsLength));
    }
}
