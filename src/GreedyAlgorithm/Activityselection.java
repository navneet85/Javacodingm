package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activityselection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //for sorted end otherwise we need to sort by end[]
        //for sorting
        int activities[][]=new int[end.length][end.length];
        for(int i=0;i<activities.length;i++){
            activities[i][0]=0;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //for sorting using comparator
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        int maxAct=1;
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(0);
        int dend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=dend){
                arr.add(i);
               dend=end[i]; 
               maxAct++;
            }
        }
        System.out.println("max activity "+maxAct);
    }
}
