package LinkedList.Assignments;

public class DeletenNode {
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
    public void display(){
        Node tempNode=head;
        while(tempNode!=null){
            System.out.print(tempNode.data+" ");
            tempNode=tempNode.next;
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=tail=newNode;
           return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void remove(int n,int m){
        Node temp=head;
        Node prev=null;
        while(m>=1){
            prev=temp;
            temp=temp.next;
            m--;
        }
        
         while(n>=1){
        //    prev.next=temp.next;
        //    prev=prev.next;
        //    temp=temp.next;
        //    temp.next=null;
            System.out.println("prev"+prev.data);
            System.out.println("temp"+temp.data);
            prev.next=temp.next;
            prev=prev.next;
            temp=temp.next;
            
            n--; 
         }
    }
    public static void main(String[] args) {
        DeletenNode ll=new DeletenNode();
        // int n=2;
        int m=2;
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.display();
        System.out.println();
        ll.remove(2,2);
        ll.display();
    }
}
