package Stack;
import java.util.Stack;
public class NextGreaterElement {
    //complexity=o(n)
    public static void nextGreater(int arr[]){
        Stack<Integer> s=new Stack<>();
        int nextgreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
           while(!s.empty() && arr[s.peek()]<=arr[i]){
               s.pop();
           }
           if(s.empty()){
            nextgreater[i]= -1;
           }
           else{
            nextgreater[i]=arr[s.peek()];
           }
           s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
    }   
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        nextGreater(arr);
    }
}
