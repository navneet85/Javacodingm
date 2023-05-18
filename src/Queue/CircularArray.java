package Queue;

public class CircularArray {
    static class circular{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        circular(int n){
          arr=new int[n];
          size=n;
          rear=-1;
          front=-1;
        }
    //empty array check
    static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    //checking if queue is full or not
    static boolean isFull(){
        return (rear+1)%size==front;
    }
    //add element
    static void add(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        //adding first element
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    //remove element 
    static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int result=arr[front];
        
        //delete last element
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return result;
    }
    //peek method
    static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }
    }
    public static void main(String[] args) {
        circular cr=new circular(3);
        cr.add(1);
        cr.add(2);
        cr.add(3);
        System.out.println(cr.remove());
        cr.add(4);
        System.out.println(cr.remove());
        cr.add(5);
        while(!cr.isEmpty()){
            System.out.println(cr.peek()+" ");
            cr.remove();
        }
    }
}
