package LinkedList.Assignments;

public class Intersecn {
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
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=tail=newNode;
           return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void display(){
        Node tempNode=head;
        while(tempNode!=null){
            System.out.print(tempNode.data+" ");
            tempNode=tempNode.next;
        }
    }
    public static Node intersection(Node head1,Node head2){
        while(head2!=null){
            Node temp1=head1;
            while(temp1!=null){
                if(temp1==head2){
                    return head2;
                }
                temp1=temp1.next;
            }
            head2=head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Node head1,head2;
        head1=new Node(10);
        head2=new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        System.out.println(intersection(head1,head2).data);
    }
}
