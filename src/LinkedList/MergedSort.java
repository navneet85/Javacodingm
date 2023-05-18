package LinkedList;
public class MergedSort {
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
    //1st step find middle
    public static Node midNode(Node head){
        //for finding middle node in special cases
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    //2nd step make two linked list left and right
    public static Node mergeLL(Node head){
        //base case
        if(head==null || head.next==null){
            return head;
        }
        //partition and recursion
        Node mid=midNode(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeLL(head);
        Node newRight=mergeLL(rightHead);
        return merge(newLeft,newRight);
    }
    public static Node merge(Node left,Node right){
       //we are passing two heads
       //because we are declaring new linked list
       //such that we cant change our original merged ll
       Node mergedll=new Node(-1);
       Node temp=mergedll;
       while(left!=null&&right!=null){
          if(left.data<=right.data){
            temp.next=left;
            left=left.next;
            temp=temp.next;
          }
          else{
            temp.next=right;
            right=right.next;
            temp=temp.next;
          }
       }
       while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
       }
       while(right!=null){
        temp.next=right;
        right=right.next;
        temp=temp.next;
      }
      return mergedll.next;
    }
    public void addFirst(int data){
        //create new Node
        Node node1=new Node(data);
        if(head==null){
            head=tail=node1;
            return;
        }
        //new nodes next=head
        node1.next=head;
        //head=new Node
        head=node1;
    }
    public void display(){
        Node tempNode=head;
        while(tempNode!=null){
           System.out.print(tempNode.data+" ");
           tempNode=tempNode.next;
        }
    };
    public static void main(String[] args) {
        MergedSort ll=new MergedSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();
        head=mergeLL(head);
        System.out.println();
        ll.display();
        

        
    }
}
