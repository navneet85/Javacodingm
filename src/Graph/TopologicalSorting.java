package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    static class Edge{
        int src;
        int dist;
        Edge(int src,int dist){
            this.src=src;
            this.dist=dist;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[3].add(new Edge(3,1));
        graph[2].add(new Edge(2,3));
    }
    public static void topologicalSort(ArrayList<Edge> graph[]){
       boolean vis[]=new boolean[graph.length];
       Stack<Integer> s=new Stack<>();
       for(int i=0;i<graph.length;i++){
           if(!vis[i]){
             topologicalSortUtil(graph,i,vis,s);
           }
       }
       while(!s.isEmpty()){
         System.out.print(s.pop()+" ");
       }
    }
    private static void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
      vis[curr]=true;
      for(int i=0;i<graph[curr].size();i++){//for visiting neighbor
          Edge e=graph[curr].get(i);
          if(!vis[e.dist]){
            topologicalSortUtil(graph,e.dist,vis,s);
          } 
      }
      s.push(curr);
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        topologicalSort(graph);
        
    }
}
