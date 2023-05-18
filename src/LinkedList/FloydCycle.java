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
    //yha se likho
    static boolean cycle(){
        //we are using slow fast approach if slow will move one step fast will move 2 step
        //we can call cycle from main
        //we can declare it in main
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
    //yhi tk bs
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
