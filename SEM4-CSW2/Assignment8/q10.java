package assignment8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

// Class representing a Graph using adjacency list representation
class Graph {
    private int numVertices;
    private LinkedList<Integer>[] adjList;

    // Constructor to initialize the graph with given number of vertices
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge between two vertices
    public void addEdge(int src, int dest) {
        adjList[src].add(dest); // For directed graph
        // adjList[dest].add(src); // For undirected graph (if needed)
    }

    // Method to perform Breadth First Search (BFS) traversal from a given source vertex
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices]; // Mark all vertices as not visited
        Deque<Integer> queue = new ArrayDeque<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Main method to test the Graph class
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Perform BFS traversal starting from vertex 0
        System.out.println("Breadth First Search (BFS) traversal starting from vertex 0:");
        graph.bfs(0);
        System.out.println();
    }
}
