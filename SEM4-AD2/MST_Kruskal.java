import java.util.*;
class Edge implements Comparable<Edge> {
    int source, destination, weight;
    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;}}
public class MST_Kruskal {
    private int vertices;
    private List<Edge> edges;
    public MST_Kruskal(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<>();
    }
    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        edges.add(edge);
    }
    private int findParent(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = findParent(parent, parent[vertex]);
        }
        return parent[vertex];}
    private void union(int[] parent, int[] rank, int x, int y) {
        int xRoot = findParent(parent, x);
        int yRoot = findParent(parent, y);

        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
    public void kruskalMST() {
        Collections.sort(edges);
        int[] parent = new int[vertices];
        int[] rank = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
            rank[i] = 0;}
        List<Edge> mst = new ArrayList<>();
        for (Edge edge : edges) {
            int x = findParent(parent, edge.source);
            int y = findParent(parent, edge.destination);
            if (x != y) {mst.add(edge);
                union(parent, rank, x, y);}}
        System.out.println("Edges of Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.source + " - " + edge.destination + " : " + edge.weight);}}
    public static void main(String[] args) {
        int vertices = 6;
        MST_Kruskal graph = new MST_Kruskal(vertices);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 0, 4);
        graph.addEdge(2, 0, 4);
        graph.addEdge(2, 1, 2);
        graph.addEdge(2, 3, 3);
        graph.addEdge(2, 5, 2);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 2, 3);
        graph.kruskalMST();}}
