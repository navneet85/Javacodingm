package Graph;

import java.util.ArrayList;

public class BridgeinGraph {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    } 
    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        
    }
    private static void dfs(ArrayList<Edge>[] graph, int curr,int par,int dt[],int low[], boolean[] vis,int time) {
        vis[curr]=true;
        dt[curr]=low[curr]=++time;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(e.dest==par){
                continue;
            }else if(!vis[e.dest]){
                dfs(graph, e.dest, curr, dt, low, vis, time);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest]){
                    System.out.println("Bridge from:"+curr+" To:"+e.dest);
                }
            }
             else{
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }
        }
        
    }
    public static void tarjansBridge(ArrayList<Edge>[] graph,int v){
        //create ywo array for discovery time and lowest discovery time
        int dt[]=new int[v];
        int low[]=new int[v];
        int time=0;
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(graph,i,-1,dt,low,vis,time);
            }
        }
    }
    
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        tarjansBridge(graph, v);


    }
}
