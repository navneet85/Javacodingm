package Graph;

import java.util.ArrayList;
//o(v+e)
public class CycleInGraph {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        //null to empty
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));

    }
    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(detectCycleUtil(graph,visited,i,-1)){
                    return true;
                };
            }
        }
        return false;
    }
    private static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int par) {
          visited[curr]=true;

          for(int i=0;i<graph[curr].size();i++){
             Edge e=graph[curr].get(i);
             //case 3rd
             if(!visited[e.dest] ){
                if(detectCycleUtil(graph,visited,e.dest,curr) )
                return true;
             } 
             //case 1st
             else if(visited[e.dest] && e.dest!=par){
                return true;
             } 
             //case3rd do nothing
          }
          return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[5];//null arraylist
        createGraph(graph);
        System.out.println(detectCycle(graph));
        
    }
}
