package PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicOpnInHeap {
    static class Heap {
         ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int parentIndex = (arr.size() - 2) / 2;
            int childIndex = arr.size() - 1;
            while (arr.get(childIndex) < arr.get(parentIndex)) {
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
        }
        public  int peek(){
            return arr.get(0);
        }

        private  void Heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            
            if(left<arr.size()&& arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size()&& arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }

            if(minIdx!=i){
                //swap
                int temp=arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx,temp);

                Heapify(minIdx);
            }
           
        }

        public  int remove(){
            int data=arr.get(0);
            //swap 1st and last
            int temp=data;
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //delete last index
            arr.remove(arr.size()-1);
            //call heapify
            Heapify(0); 

            return data;

        }

        public  boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(6);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

        
    }
}
