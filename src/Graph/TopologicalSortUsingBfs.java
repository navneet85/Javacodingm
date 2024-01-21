package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortUsingBfs {
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
        // graph[5].add(new Edge(5, 0));
        // graph[5].add(new Edge(5, 2));
        // graph[4].add(new Edge(4, 0));
        // graph[4].add(new Edge(4, 1));
        // graph[3].add(new Edge(3,1));
        // graph[2].add(new Edge(2,3));
        graph[1].add(new Edge(1, 0));
    }
    public static void topSortUsingBfs(ArrayList<Edge>[] graph){
        //calculate indegree
        int indeg[]=new int[graph.length];
        calculateIndeg(graph,indeg);
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0)
             q.add(i);
        }
        //perform bfs
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dist]--;
                if(indeg[e.dist]==0){
                    q.add(e.dist);
                }
            }
            
        }
        System.out.println();
    }
    private static void calculateIndeg(ArrayList<Edge>[] graph, int[] indeg) {
        // TODO Auto-generated method stub
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e= graph[v].get(j);
                indeg[e.dist]++;
            }
        }
    }
    public static void main(String[] args) {
        int v=2;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        topSortUsingBfs(graph);
    }
}
