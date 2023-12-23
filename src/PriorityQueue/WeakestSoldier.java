package PriorityQueue;

import java.util.PriorityQueue;

public class WeakestSoldier {
    public static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        Row(int soldier,int idx){
            this.soldier=soldier;
            this.idx=idx;
        }

        @Override
        public int compareTo(Row p){
            if(this.soldier==p.soldier){
                return this.idx-p.idx;
            }
            return this.soldier-p.soldier;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<Row> pq=new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    count=count+1;
                }
            }
           pq.add(new Row(count, i));
        }
        while(k>=1){
            System.out.println("row "+pq.remove().idx);
            k--;
        }
        
    }
}
