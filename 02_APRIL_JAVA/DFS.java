import java.util.ArrayList;
import java.util.List;

class Graph {
  private int vertices;
  private List<List<Integer>> adjacencyList;

  public Graph(int vertices) {
    this.vertices = vertices;
    adjacencyList = new ArrayList<>(vertices);
    for (int i = 0; i < vertices; i++) {
      adjacencyList.add(new ArrayList<>());
    }
  }

  public void addEdge(int source, int destination) {
    adjacencyList.get(source).add(destination);
  }

  public void DFS(int startVertex) {
    boolean[] visited = new boolean[vertices];
    DFSUtil(startVertex, visited);
  }

  private void DFSUtil(int vertex, boolean[] visited) {
    visited[vertex] = true;
    System.out.print(vertex + " ");

    List<Integer> neighbors = adjacencyList.get(vertex);
    for (int neighbor : neighbors) {
      if (!visited[neighbor]) {
        DFSUtil(neighbor, visited);
      }
    }
  }
}

public class DFS {
  public static void main(String[] args) {
    Graph graph = new Graph(5);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 4);

    System.out.println("Depth First Traversal (starting from vertex 0):");
    graph.DFS(0);
  }
}
