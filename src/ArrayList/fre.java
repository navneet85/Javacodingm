package ArrayList;
import java.util.*;
public class fre {
    public static void main(String[] args) {
        int A[]={2,4,5,3,1,6};
        int L=1;
        int R=6;
        int N=A.length;
        int ar[]=new int[R-L+1];
        int t=0;
        for(int p=L-1;p<R;p++){
            ar[t]=A[p];
            t++;
        }
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        if(ar.length%2==0){
            System.out.println(ar[ar.length/2-1]);
        }
        else{
            System.out.println(ar[ar.length/2]);
        }
        
    }
}
