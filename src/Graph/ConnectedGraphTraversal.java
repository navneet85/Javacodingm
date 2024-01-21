package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedGraphTraversal {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void bfsutil(ArrayList<Edge> graph[]){
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
               bfs(graph,visited,i);
            }
        }
    }
    public static void bfs(ArrayList<Edge>[] graph, boolean[] visited,int src) {
        Queue<Integer> q=new LinkedList<>();
        q.add(src);//source
        while(!q.isEmpty()){
            int curr=q.remove();

            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                //add neighbors
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];//null array
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
        bfsutil(graph);

    }
}
