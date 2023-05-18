package Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    static boolean checkForDuplicateParenthesis(String str) {
        for (int i = 0; i < str.length(); i++) {
            // for opening,operators and operands
            char ch = str.charAt(i);
            Stack<Character> s = new Stack<>();
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(checkForDuplicateParenthesis(str));
    }
}
