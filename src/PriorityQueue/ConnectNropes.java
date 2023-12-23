package PriorityQueue;

import java.util.PriorityQueue;

public class ConnectNropes {
    public static void main(String[] args) {
        int ropes[]={4,3,2,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int minCost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            pq.add(min+min2);
            minCost=minCost+min+min2;
        }
        System.out.println(minCost);
        
    }
}
