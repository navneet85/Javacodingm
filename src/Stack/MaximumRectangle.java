package Stack;

import java.util.Stack;

public class MaximumRectangle {
   static void maxArea(int arr[]){
    int nsr[]=new int [arr.length];
    int nsl[]=new int [arr.length];
    Stack<Integer> s=new Stack<>();
    int maxArea=0;
    //nextSmallerRight
    for(int i=arr.length-1;i>=0;i--){
        while(!s.empty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.empty()){
         nsr[i]= -1;
        }
        else{
         nsr[i]=arr[s.peek()];
        }
        s.push(i);
     }
     s=new Stack<>();
     //nextsmaller left
     for(int i=0;i<arr.length;i++){
        while(!s.empty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.empty()){
         nsl[i]= -1;
        }
        else{
         nsl[i]=arr[s.peek()];
        }
        s.push(i);
     }
     //calculate area nsr[i]-nsl[i]=width
     for(int i=0;i<arr.length;i++){
        int height=arr[i];
        int width=nsr[i]-nsl[i]-1;
        int currArea=height*width;
        maxArea=Math.max(currArea,maxArea);
     }
     System.out.println(maxArea);
   }
    public static void main(String[] args) {
        int arr[]={2,4};
        maxArea(arr);

    }
}
