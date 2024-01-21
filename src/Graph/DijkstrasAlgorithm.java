package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
//time complexity=v+elogv
public class DijkstrasAlgorithm {
    static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 5, 5));
        graph[4].add(new Edge(4, 3, 2));
 
    }
    //we will add pair classes for adding pair int priorityqueue
    static class pair implements Comparable<pair>{
        int n;int path;
        pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        @Override
        public int compareTo(pair o) {
            return this.path-o.path;
        }
    }
    //we have implemented compareto to add pair in priority queue based on path order;
    private static void dijkstra(ArrayList<Edge>[] graph,int src) {
        int dist[]=new int[graph.length];//distance of i from src;
        boolean vis[]=new boolean[graph.length];

        //to mark dist of vertex other than src to infinity
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        //make priorityque of pair
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(src, 0));
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;
                //loop for neighbors
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.weight;
                    //update of distance from source to v
                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }

        }
        //print all distance
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }

    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        createGraph(graph);
        int src=0;
        dijkstra(graph,src);
        
    }
    
}
