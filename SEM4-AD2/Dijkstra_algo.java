import java.util.*;

public class Dijkstra_algo {
    private int V;
    private List<List<Node>> adjList;

    static class Node implements Comparable<Node> {
        int dest;
        int weight;

        Node(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }
    Dijkstra_algo(int vertices) {
        V = vertices;
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Node(dest, weight));
    }
    void dijkstra(int source) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));
        while (!pq.isEmpty()) {
            int u = pq.poll().dest;
            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.dest;
                int weight = neighbor.weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }
        System.out.println("Vertex Distance from Source:");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }
    public static void main(String[] args) {
        int V = 5;
        Dijkstra_algo graph = new Dijkstra_algo(V);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 1, 3);
        graph.addEdge(3, 2, 9);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 7);
        graph.addEdge(4, 2, 6);


        graph.dijkstra(0);
    }
}
