package Queue.QueueUsingLL;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue qu = new LinkedList<>();
        //we can also use ArrayDeque
        qu.add(1);
        qu.add(2);
        qu.add(3);
        while(!qu.isEmpty()) {
            System.out.println(qu.peek());
            qu.remove();
        }
    }

}
