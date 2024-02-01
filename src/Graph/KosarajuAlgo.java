package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,4));
    }
    private static void topSort(ArrayList<Edge>[] graph, int curr, Stack<Integer> top, boolean[] vis) {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest])
            topSort(graph, e.dest, top, vis);
        }
        top.push(curr);
    }
    private static void dfs(ArrayList<Edge>[] transpose, int curr, boolean[] vis) {
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<transpose[curr].size();i++){
            Edge e=transpose[curr].get(i);
            if(!vis[e.dest])
            dfs(transpose, e.dest, vis);
        }
    }
    public static void kosarajuAlgo(ArrayList<Edge> graph[],int v){
        //step1(find topsort stack)
        Stack<Integer> top=new Stack<>();
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
               topSort(graph,i,top,vis);
            }
        }
        //step2(transpose graph)
        ArrayList<Edge> transpose[]=new ArrayList[v];
        for(int i=0;i<v;i++){
            vis[i]=false;
            transpose[i]=new ArrayList<>();
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].size();j++){
               Edge e=graph[i].get(j);//src->dest
               transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        }
        //step3 reverse dfs based on topstack
        while(!top.isEmpty()){
            int curr=top.pop();
            if(!vis[curr]){
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        kosarajuAlgo(graph, v);
    }
}
