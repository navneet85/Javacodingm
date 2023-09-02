package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue{
        Deque<Integer> dq= new LinkedList<>();
        boolean isEmpty() {
            return dq.isEmpty();
        }
        void add(int data){
            dq.addLast(data);
        }
        int remove(){
            int p =dq.removeFirst();
            return p;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
    }
}
