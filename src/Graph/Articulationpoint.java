package Graph;

import java.util.ArrayList;

public class Articulationpoint {
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
        graph[4].add(new Edge(4,3));
        
    }
    //o(v+e)
    private static void dfs(ArrayList<Edge>[] graph, int curr, int par, int[] dt, int[] low, boolean[] vis, int time,boolean[] ap) {
        vis[curr]=true;
        dt[curr]=low[curr]=++time;
        int children=0;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(e.dest==par){
                continue;
            } else if(vis[e.dest]){
               low[curr]=Math.min(low[curr],dt[e.dest]);
            }else{
                 dfs(graph, e.dest, curr, dt, low, vis, time,ap);
                 low[curr]=Math.min(low[curr],low[e.dest]);
                 if(par!=-1 && dt[curr]<=low[e.dest]){
                     ap[curr]=true;

                 }
                 children++;
            }
            
        }
        if(par==-1 && children>1){
            ap[curr]=true;
         }
    }
    public static void getAp(ArrayList<Edge>[] graph,int v){
        int dt[]=new int[v];
        int low[]=new int[v];
        int time=0;
        boolean ap[]=new boolean[v];
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(graph,i,-1,dt,low,vis,time,ap);
            }
        }
        for(int i=0;i<v;i++){
            if(ap[i]){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        getAp(graph, v);
    }
}
