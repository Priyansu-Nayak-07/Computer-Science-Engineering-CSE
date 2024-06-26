package assignment8;

import java.util.LinkedList;

//Class representing a Graph using adjacency list representation
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

 // Method to perform Depth First Search (DFS) traversal from a given source vertex
 public void dfs(int startVertex) {
     boolean[] visited = new boolean[numVertices]; // Mark all vertices as not visited
     dfsUtil(startVertex, visited);
 }

 // Recursive utility function to perform DFS traversal
 private void dfsUtil(int vertex, boolean[] visited) {
     visited[vertex] = true;
     System.out.print(vertex + " ");

     // Recur for all vertices adjacent to this vertex
     for (int neighbor : adjList[vertex]) {
         if (!visited[neighbor]) {
             dfsUtil(neighbor, visited);
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

     // Display the adjacency list representation of the graph
     System.out.println("Adjacency List Representation:");
     graph.printAdjacencyList();

     // Perform DFS traversal starting from vertex 0
     System.out.println("\nDepth First Search (DFS) traversal starting from vertex 0:");
     graph.dfs(0);
     System.out.println();
 }

 // Method to print the adjacency list representation of the graph
 public void printAdjacencyList() {
     for (int i = 0; i < numVertices; i++) {
         System.out.print(i + " -> ");
         for (int vertex : adjList[i]) {
             System.out.print(vertex + " ");
         }
         System.out.println();
     }
 }
}
