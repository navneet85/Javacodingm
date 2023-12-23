package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProblem {

    static class Job{
        int deadline;
        int profit;
        int id;

        Job(int id,int dead,int profit){
            this.deadline=dead;
            this.profit=profit;
            this.id=id;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> job= new ArrayList<>();
        
        for(int i=0;i<jobsInfo.length;i++){
            job.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        //we need to sort on basis of profit in descending order

        // Collections.sort(job,(a,b)->a.profit-b.profit);for ascending order
        Collections.sort(job,(a,b)->b.profit-a.profit);//for descending order

        ArrayList<Integer> seq=new ArrayList<>();
        int time =0;
        for(int i=0;i<job.size();i++){
            Job curr=job.get(i);
            if(time<curr.deadline){
               seq.add(curr.id);
               time++;
            }
        }

        System.out.println(seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i));
        }

    }
}
