package String;

public class StringCompression {
    public static void main(String[] args) {
        String s="aaabbccdd";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
           if(count>1){
            sb.append(Character.toString(s.charAt(i))+count);
           }
           else sb.append(Character.toString(s.charAt(i)));
        }
        System.out.println(sb.toString());
    }
}
