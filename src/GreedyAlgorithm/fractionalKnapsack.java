package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int weightgiven=50;
        
        int vwRatio[]=new int[weight.length];
        for(int i=0;i<weight.length;i++){
            vwRatio[i]=val[i]/weight[i];
        }
        //Arrays.sort(vwRatio);
        int activities[][]=new int[val.length][val.length];
        for(int i=0;i<activities.length;i++){
            activities[i][0]=i;
            activities[i][1]=vwRatio[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[1]));
        

    }
}
