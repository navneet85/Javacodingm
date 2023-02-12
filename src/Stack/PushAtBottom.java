package Stack;

import java.util.Stack;

public class PushAtBottom {
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
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAt(stack,4);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
