package GreedyAlgorithm;
import java.util.*;
public class MinNoOFCoinsNotes {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        int count=0;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=nums){
                while(coins[i]<=nums){
                    arr.add(coins[i]);
                    count=count+1;
                    nums=nums-coins[i];
                }
            }
        }
        System.out.println(count);
         sc.close();
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
