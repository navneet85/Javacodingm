package Stack;

import java.util.Stack;

public class StockSpan {
    static Stack<Integer> stockSpan(Stack<Integer> s){
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<s.size();i++){
            int count=0;
           for(int j=0;j<=i;j++){
            if(s.get(j)<=s.get(i)){
               count++;
            }
           }
           s1.push(count);
        }
        return s1;
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(100);
        s.push(80);
        s.push(60);
        s.push(70);
        s.push(60);
        s.push(85);
        s.push(100);
        System.out.println(s);
        System.out.println(stockSpan(s));

        
    }
}
