package LinkedList;

public class FloydCycle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addEnd(int data){
        //create new Node
        Node node=new Node(data);
        size++;
        if(head==null){
            head=tail=node;
            return;
        }
        //new nodes next=head
        tail.next=node;
        //head=new Node
        tail=node;
    }
    public void display(){
        Node tempNode=head;
        while(tempNode!=null){
           System.out.print(tempNode.data+" ");
           tempNode=tempNode.next;
        }
    };
    static boolean cycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle){
          Node prev=null;
          slow=head;
          while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
          }
          prev.next=null;
       }
       else{
        System.out.println("No cycle found");
       }
    }
    public static void main(String[] args) {
        // FloydCycle ll=new FloydCycle();
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        //1->2->3->2
        //ll.display();
        System.out.println();
        System.out.println(cycle());
        removeCycle();
        System.out.println(cycle());
    }
}
