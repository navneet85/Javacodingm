package Queue;

public class UsingArray {
    static class queue{
        static int arr[];
        static int size;
        static int rear;
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //add element
        static void add(int data){
           if(rear==size-1){
            System.out.println("queue is full");
            return;
           }
           rear=rear+1;
           arr[rear]=data;
        }
        //print element
        static void print(){
            for(int i=0;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        //remove element
        static int remove(){
            if(rear==-1){
                System.out.println("queue is empty");
                return -1;
            }
            int i=arr[0];
            for(int p=0;p<rear;p++){
                arr[p]=arr[p+1];
            }
            rear--;
            return i;
        }
        //peek element
        static int peek(){
            if(rear==-1){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
           System.out.println(q.peek());
           q.remove();
        }
        
    }
}
