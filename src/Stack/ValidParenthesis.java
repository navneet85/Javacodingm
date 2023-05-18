package Stack;
import java.util.Stack;

public class ValidParenthesis {
    static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // for opening case
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // for closing set
                if (s.empty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '[' && ch == ']') ||
                        (s.peek() == '{' && ch == '}')) {
                    s.pop();
                } else {
                    return false;
                }
                //for new it will create new memory
            }
        }
        if (s.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "[]";
        System.out.println(isValid(str));
    }
}
