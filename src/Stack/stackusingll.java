package Stack;

public class stackusingll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static Node head=null;
    public static boolean isEmpty(){
        return head==null;
    }
    public static void push(int data){
       Node newNode=new Node(data);
       if(isEmpty()){
        head=newNode;
        return;
       }
       newNode.next=head;
       head=newNode;  
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        } 
        int top=head.data;
        head=head.next;
        return top;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        } 
        int top=head.data;
        return top;
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(peek());
        System.out.println(pop()); 
    }
}
