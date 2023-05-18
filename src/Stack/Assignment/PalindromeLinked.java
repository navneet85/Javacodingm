package Stack.Assignment;

import java.util.Stack;

public class PalindromeLinked {
    static class Node{
       int data;
       Node next;
       Node(int data){
        this.data=data;
        next=null;
       }
    }
    public static void main(String[] args) {
        Node one= new Node(1);
        Node two= new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(3);
        Node six=new Node(2);
        Node seven=new Node(1);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        System.out.println(isBool(one));

    }
    private static boolean isBool(Node one) {
        Stack<Integer> s=new Stack<>();
        Node temp=one;
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        boolean bool=true;
        while(one!=null){
            int i=s.pop();
            if(one.data!=i){
                bool=false;
                break;
            }
            one=one.next;
        }
        return bool;
    }
}
