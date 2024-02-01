package Graph;

import java.util.ArrayList;

//it works for finding path if negative edges are there
public class BellmanfordAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3,4,4));
        graph[4].add(new Edge(4, 1, -1));
    }
    public static void bellmanFord(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            dist[i]=(i==src)?0:Integer.MAX_VALUE;
        }
        //perform algo
        //tc=O(E)*O(V)
        for(int i=0;i<graph.length-1;i++){
            //edge u-v
            //tc=O(edge)
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    //dist[u]!=Integer.MAX_VALUE because in java and c++ infinity +something will be negative value
                    if(dist[u]!=Integer.MAX_VALUE&&dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        bellmanFord(graph, 0);
        
    }
}
