package Queue.QueueUsingLL;

public class Basic {
    static class Node {
        int data;
        Node next;
        Node(int data){
          this.data = data;
          this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data)
            if(head == null){
               head = tail = newNode;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
