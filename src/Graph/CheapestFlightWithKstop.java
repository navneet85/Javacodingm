package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightWithKstop {
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
    static class Info {
        int vertex;
        int cost;
        int stop;
        Info(int vertex,int cost,int stop){
            this.vertex=vertex;
            this.cost=cost;
            this.stop=stop;
        }
    }
    private static void createGraph(int[][] flights, ArrayList<Edge>[] graph) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
            int src=flights[i][0];
            int dest=flights[i][1];
            int wt=flights[i][2];
            graph[src].add(new Edge(src,dest,wt));
        }
    }
    public static int cheapestFlight(int n,int flights[][],int src,int dest,int stop){
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[n];
        createGraph(flights,graph);
        int dist[]=new int[n];
        for(int i=0;i<dist.length;i++){
            dist[i]=i==src?0:Integer.MAX_VALUE;
        }
        Queue<Info> pq=new LinkedList<>();
        pq.add(new Info(src,0,0));
        while(!pq.isEmpty()){
            Info curr=pq.remove();
            if(curr.stop>stop){
                break;
            }
            for(int i=0;i<graph[curr.vertex].size();i++){
                Edge e=graph[curr.vertex].get(i);
                int u=e.src;
                int v=e.dest;
                int w=e.wt;
                //here we need to change dist[u]!=Integer.MAX_VALUE&& dist[u]+w<dist[v]&& curr.stop<=stop
                //For getting corner case by replacing dist[u] with curr.cost in line 61
                if(curr.cost+w<dist[v]&& curr.stop<=stop){
                    dist[v]=dist[u]+w;
                    pq.add(new Info(v,dist[v],curr.stop+1));
                }
                
            }

        }
        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        } else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int v=4;
        int flights[][]={{0,1,100},{1,2,100},{1,3,600},{2,0,100},{2,3,200}};
        int src=0,dest=3,stop=1;
        System.out.println(cheapestFlight(v, flights, src, dest, stop));
        
        
    }
    
}
