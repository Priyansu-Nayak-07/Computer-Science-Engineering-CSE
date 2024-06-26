package assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Graph class using Adjacency Matrix
class GraphMatrix {
    private int[][] adjMatrix;
    private int numVertices;

    // Constructor
    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Method to add an edge
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; // For undirected graph
    }

    // Method to display the adjacency matrix
    public void displayMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Graph class using Adjacency List
class GraphList {
    private List<List<Integer>> adjList;
    private int numVertices;

    // Constructor
    public GraphList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    // Method to add an edge
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // For undirected graph
    }

    // Method to display the adjacency list
    public void displayList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");
            for (int j : adjList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Main class to test the graph implementations
public class q8 {
    public static void main(String[] args) {
        int numVertices = 5;

        // Graph using Adjacency Matrix
        GraphMatrix graphMatrix = new GraphMatrix(numVertices);
        graphMatrix.addEdge(0, 1);
        graphMatrix.addEdge(0, 4);
        graphMatrix.addEdge(1, 2);
        graphMatrix.addEdge(1, 3);
        graphMatrix.addEdge(1, 4);
        graphMatrix.addEdge(2, 3);
        graphMatrix.addEdge(3, 4);
        graphMatrix.displayMatrix();

        // Graph using Adjacency List
        GraphList graphList = new GraphList(numVertices);
        graphList.addEdge(0, 1);
        graphList.addEdge(0, 4);
        graphList.addEdge(1, 2);
        graphList.addEdge(1, 3);
        graphList.addEdge(1, 4);
        graphList.addEdge(2, 3);
        graphList.addEdge(3, 4);
        graphList.displayList();
    }
}

