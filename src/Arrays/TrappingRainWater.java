package Arrays;
//import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int waterlevel[]=new int[height.length];
        waterlevel[0]=waterlevel[height.length-1]=0;
        int sum=0;
        for(int i=1;i<waterlevel.length-1;i++){
            //find left most 
            int left=0;
            for(int j=0;j<i;j++){
                left=Math.max(left,height[j]);
            }
            //find right most
            int right=0;
            for(int j=i+1;j<height.length;j++){
                right=Math.max(right,height[j]);
            }
            System.out.println(left+" "+right);
            int c=Math.min(left,right)-height[i];
            if(c>0)
            sum=sum+Math.min(left,right)-height[i];
        }
       System.out.println(sum);
    }
}
////////it can be solved by taking by O(n) complexity by taking two array[left and right array]