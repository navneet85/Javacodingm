package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraph {
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

    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        q.add(0);//source=0
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

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean visited[]){
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
               dfs(graph, e.dest, visited);
            }
        }

    }
    public static void main(String[] args) {
        int vertices=5;
        ArrayList<Edge>[] graph=new ArrayList[5];//null array list
        //null to empty conversion
        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<>();
        }
        //0
        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        graph[2].add(new Edge(2,4,2));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,1,1));
        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));
        graph[4].add(new Edge(4,2,2));

        //2's neighbour
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println();
        //graph traversal using bfs
        bfs(graph);
        //dfs traversal
        System.out.println();

        dfs(graph, 0, new boolean[vertices]);
    }
}
