package LinkedList;

public class BasicOpern {
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
    
    public void addStart(int data){
        //create new Node
        Node node1=new Node(data);
        size++;
        if(head==null){
            head=tail=node1;
            return;
        }
        //new nodes next=head
        node1.next=head;
        //head=new Node
        head=node1;
    }
    //yhi tak likhna iske bd jaha se bolengr wha se
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
    public void addMiddle(int idx,int data ){
        if(idx==0){
            addStart(data);
            return;
          }
      Node newNode=new Node(data);
      size++;
      Node temp=head;
      int i=0;
      while(i<idx-1){
        temp=temp.next;
        i++;
      }
      newNode.next=temp.next;
      temp.next=newNode;
    }
    public void removeFirst(){
       if(size==0){
        System.out.println("LL is empty");
        return;
       }
       else if(size==1){
        head=tail=null;
        size=0;
        return;
       }
       head=head.next;
       size--; 
    }
    public void removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return;
           }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        } 
        Node prev=head;
        //prev will be at 
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        size--;
        prev.next=null;
        tail=prev;
    }
    public boolean search(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    } 
    public int helper(Node head,int key){
        //base case
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    //yha se line no 119 se 125
    public void display(){
        Node tempNode=head;
        while(tempNode!=null){
            System.out.print(tempNode.data+" ");
            tempNode=tempNode.next;
        }
    }
    //yhi tk
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void removeNthFromLast(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
           temp=temp.next;
           sz=sz+1;
        }
        //for deleting head
        if(n==sz){
            head=head.next;
            return;
        }
        //sz-n for finding prev node of nth node
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node findMid(){
        //slow-fast approach
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;//turtle
            fast=fast.next.next;//hare
        }
        return slow;
    }
    public boolean checkpalindrome(){
        //base case
        if(head==null ||head.next==null){
            return true;
        }
        //step1 find mid
        Node mid=findMid();
        //ste2 reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //3rd check 1st half and last half
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        BasicOpern ll=new BasicOpern();
        ll.addStart(1);
        ll.addStart(2);
        ll.addEnd(3);
        ll.addEnd(3);
        ll.addEnd(1);
        ll.addEnd(2);
        //ll.addMiddle(1, 23);
        //ll.display();
        // System.out.println();
        // System.out.println(size);
        // ll.removeFirst();
        // ll.display();
        // System.out.println();
        // System.out.println(size);
        // ll.removeLast();
        // ll.display();
        // System.out.println();
        // System.out.println(size);
        // System.out.println(ll.search(7));
        // System.out.println(ll.search(3));
        // System.out.println(ll.recursiveSearch(3));
        // ll.reverse();
        // ll.display();
        // System.out.println();
        // ll.removeNthFromLast(3);
        ll.display();
        System.out.println(ll.checkpalindrome());
    }
}
