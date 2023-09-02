package Queue.QueueUsingLL;

import java.util.Stack;

public class QueueUsingStack {
    static class Queue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
       void add(int n){
        if(stack1.isEmpty()){
            stack1.push(n);
            return;
        }
        else {
            while(!stack1.isEmpty()){
                int p= stack1.pop();
                stack2.push(p); 
            }
            stack1.push(n);
            while(!stack2.isEmpty()){
                int p= stack2.pop();
                stack1.push(p); 
            }
        }
        
       }
       void display(){
        while(!stack1.isEmpty()){
            int p= stack1.pop();
            System.out.println(p);
        }
       }
       int remove() {
        if(stack1.isEmpty()){
            System.out.println("empty stack");
            return -1;
        }
        int p= stack1.pop();
        return p;
       }
    }
    public static void main(String[] args) {
        Queue qu = new Queue();
        for(int i=0;i<6;i++){
          qu.add(i);
        }
        // qu.display();
        qu.remove();
        qu.display();
    }
}
