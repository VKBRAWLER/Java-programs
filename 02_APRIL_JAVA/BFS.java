import java.util.LinkedList;
import java.util.Queue;

class Graph {
  private int V; // number of vertices
  private LinkedList<Integer>[] adj; // adjacency list

  Graph(int n) {
    V = n;
    adj = new LinkedList[n];
    for (int i = 0; i < n; i++) {
    adj[i] = new LinkedList<>();
    }
  }

  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  void BFS(int s) {
    boolean[] visited = new boolean[V];
    Queue<Integer> queue = new LinkedList<>();

    visited[s] = true;
    queue.add(s);

    while (!queue.isEmpty()) {
      s = queue.poll();
      System.out.print(s + " ");

      for (int i : adj[s]) {
        if (!visited[i]) {
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }
}

public class BFS {
  public static void main(String[] args) {
    Graph g = new Graph(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println("Breadth First Traversal (starting from vertex 2):");
    g.BFS(2);
  }
}
