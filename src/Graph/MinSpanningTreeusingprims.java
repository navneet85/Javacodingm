package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

import Graph.DijkstrasAlgorithm.pair;

public class MinSpanningTreeusingprims {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.wt=wt;
            this.dest=dest;
        }
    }
    static class Pair implements Comparable<Pair>{
        int vertex;
        int cost;
        Pair(int v,int c){
            vertex=v;
            cost=c;
        }
        @Override
        public int compareTo(Pair o) {
            
            return this.cost-o.cost;
        }
    }
    private static void creategraph(ArrayList<Edge>[] graph) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,3,30));
        graph[0].add(new Edge(0,2,15));
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,2,50));
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));
    }
    public static void findMstUsingPrims(ArrayList<Edge> graph[],int src){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        ArrayList<Edge> spanningTree=new ArrayList<>();
        pq.add(new Pair(src, 0));
        int minCost=0;
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            int m=p.vertex;
            // if(p.vertex!=src){
            //     spanningTree.add(new Edge(m,p.vertex,p.cost));
            // }
            if(!vis[p.vertex]){
                vis[p.vertex]=true;
                minCost+=p.cost;
                for(int i=0;i<graph[p.vertex].size();i++){
                    Edge e=graph[p.vertex].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                }
                if(m!=src)
              spanningTree.add(new Edge(pq.peek().vertex,m,pq.peek().cost));
            }
        }
        System.out.println(minCost);
        for(int i=0;i<spanningTree.size();i++){
            System.out.print(spanningTree.get(i).src+" "+spanningTree.get(i).dest+" "+spanningTree.get(i).wt); 
            System.out.println(); 
        }

    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creategraph(graph);
        findMstUsingPrims(graph, 0);
    }
   
}
