package Stack;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s="3[a]";
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']'){
              stack.push(s.substring(i,i+1));
            } else{
               StringBuilder sb=new StringBuilder();
               while(!stack.isEmpty()){
                if(stack.peek()=="["){
                    stack.pop();
                    stack.push(sb.toString().repeat(Integer.parseInt(stack.pop())));
                    break;
                }
                sb.append(stack.pop());
               }
            
            }
            
        }
        System.out.println(stack.pop());
        
        
    }
}
