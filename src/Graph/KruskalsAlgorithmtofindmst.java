package Graph;

import java.util.ArrayList;
import java.util.Collections;
public class KruskalsAlgorithmtofindmst {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.wt=wt;
            this.dest=dest;
        }
        @Override
        public int compareTo(Edge o) {
            return this.wt-o.wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph){
        
        graph.add(new Edge(0,1,10));
        graph.add(new Edge(0,3,30));
        graph.add(new Edge(0,2,15));
        graph.add(new Edge(1,0,10));
        graph.add(new Edge(1,0,10));
        graph.add(new Edge(1,3,40));
        graph.add(new Edge(3,1,40));
        graph.add(new Edge(3,0,30));
        graph.add(new Edge(3,2,50));
        graph.add(new Edge(2,0,15));
        graph.add(new Edge(2,3,50));
    }
    static int size=4;
    static int par[]=new int[4];
    static int rank[]=new int[4];

    public static void init(){
        for(int i=0;i<par.length;i++){
            par[i]=i;
        }
    }

    public static int find(int a){
        if(a==par[a]){
            return a;
        }
        return par[a]=find(par[a]);
    }

    public static void union(int a,int b){
        int parentofa=find(a);
        int parentofb=find(b);
        if(rank[parentofa]==rank[parentofb]){
            par[parentofb]=parentofa;
            rank[parentofa]++;
        } else if(rank[parentofa]<rank[parentofb]){
            par[parentofa]=parentofb;
        } else{
            par[parentofb]=parentofa;
        }
    }

    public static int kruskalAlgo(ArrayList<Edge> graph,int V){
        Collections.sort(graph);
        int mstCost=0;
        int count=0;
        for(int i=0;count<V-1;i++){
            Edge e=graph.get(i);
            int a=e.src;
            int b=e.dest;
            int para=find(a);
            int parb=find(b);
            if(para!=parb ){
              union(a,b);
              mstCost+=e.wt;
              count++;
            }
        }
        return mstCost;
    }


    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph=new ArrayList<>();
        init();
        createGraph(graph);
        System.out.println(kruskalAlgo(graph, v));
        
        
    }
}
