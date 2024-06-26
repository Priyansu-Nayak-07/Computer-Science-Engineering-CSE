import java.util.*;
public class DFS{
    static class Graph
    {
        int V;
        LinkedList<Integer>[] adj;
        Graph(int V)
        {
            this.V = V;
            adj = new LinkedList[V];
            for (int i = 0; i < adj.length; i++)
                adj[i] = new LinkedList<Integer>();
        }
        void addEdge(int v, int w)
        {
            adj[v].add(w);
        }
        void DFS(int s)
        {
            Vector<Boolean> visited = new Vector<Boolean>(V);
            for (int i = 0; i < V; i++)
                visited.add(false);
            Stack<Integer> stack = new Stack<>();
            stack.push(s);
            while(stack.empty() == false)
            {
                s = stack.peek();
                stack.pop();
                if(visited.get(s) == false)
                {
                    System.out.print(s + " ");
                    visited.set(s, true);
                }
                Iterator<Integer> itr = adj[s].iterator();

                while (itr.hasNext())
                {
                    int v = itr.next();
                    if(!visited.get(v))
                        stack.push(v);
                } }  } }
    public static void main(String[] args)
    {
        Graph g = new Graph(9);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 6);
        g.addEdge(4, 7);
        g.addEdge(5, 7);
        g.addEdge(6, 7);
        System.out.println("Following is the Depth First Traversal");
        g.DFS(0);
    }
}