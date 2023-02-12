package LinkedList;

public class Doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void display(){
        Node temp=head;;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("empty list");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        Doublyll ll=new Doublyll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();
        System.out.println();
        // ll.removeFirst();
        // ll.display();
        ll.reverse();
        ll.display();
    }
}
