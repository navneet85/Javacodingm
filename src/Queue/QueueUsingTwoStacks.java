package Queue;

import java.util.*;;

public class QueueUsingTwoStacks {
    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty()&& q2.isEmpty();
        }
        
        public static void add(int n){
            if(!q1.isEmpty()){
                q1.add(n);
            }
            if(!q2.isEmpty()){
               q2.add(n);
            }
        }

    }
    public static void main(String[] args) {
        
    }

}
