package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IsBipartite {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
        graph[2].add(new Edge(2, 0));

        graph[2].add(new Edge(2, 4));
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length];

        for (int i = 0; i < col.length; i++) {
            col[i] = -1;// assigning -1 initially for no colour
        }
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {// perform bfs
                que.add(i);
                col[i] = 0;// o for yellow colour
                while (!que.isEmpty()) {
                    int curr = que.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) {
                            int nextColor = col[curr] == 0 ? 1 : 0;// for opposite color
                            col[e.dest] = nextColor;
                            que.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;//not bi partite
                        }
                    }

                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];// null array
        // null to empty
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
