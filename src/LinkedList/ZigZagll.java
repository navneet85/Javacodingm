package LinkedList;

public class ZigZagll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addLast(int data){
        Node d=new Node(data);
       if(head==null){
         head=tail=d;
       }
       tail.next=d;
       tail=d;
    }
    
    
    public static void zigZag(){
        //mid node
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //alternate setting of element
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=left;

            left=nextL;
            right=nextR;
        }
        
    }
    public static void dispaly(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        dispaly();
        System.out.println();
        zigZag();
        dispaly();
    }
}
