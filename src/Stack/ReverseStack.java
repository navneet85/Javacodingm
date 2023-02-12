package Stack;

import java.util.Stack;

public class ReverseStack {
    public static Stack<Integer> reverse(Stack<Integer> s){
        Stack<Integer> s1=new Stack<>();
        while(!s.isEmpty()){
           int top=s.pop();
           s1.push(top);
        }
       return s1;
    }
    public static void pushAt(Stack<Integer> stack,int d){
        //base case
        if(stack.isEmpty()) {
            stack.push(d);
            return;
        }
        int top=stack.pop();
        pushAt(stack,d);
        stack.push(top);
    }
    public static void reverseusingRecurs(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseusingRecurs(s);
        pushAt(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // System.out.println(reverse(s).peek());
        reverseusingRecurs(s);
        System.out.println(s.peek());
    }
}
