package Stack;

public class newt {
    private static int getLength(String s, String t) {
        if(s.length() % t.length() > 0)
            return -1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i*t.length() < s.length();i++) {
            sb.append(t);
        }
        System.out.println(sb);
        if(!sb.toString().equals(s))
            return -1;
        int divisible = 1;
        for(int i=1;i<=t.length();i++) { 
  
           if(t.length()%divisible++ != 0) {
                continue;
            }
            sb = new StringBuilder();
            String subStr = t.substring(0, i);
            while(sb.length() < t.length()) {
                sb.append(subStr);
            }
            if(sb.toString().equals(t))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(getLength("bcdbcdbcdbcd", "bcdbcd")); 
    }
}
