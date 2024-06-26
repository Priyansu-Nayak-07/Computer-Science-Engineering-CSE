import java.util.*;
class Node implements Comparable<Node> {
    char ch;
    int weight;
    Node left, right;
    public Node(char ch, int weight) {
        this.ch = ch;
        this.weight = weight;
        left = right = null;
    }
    @Override
    public int compareTo(Node other) {
        return this.weight - other.weight;
    }
}
class Huffman {
    public static Node buildHuffmanTree(char[] C, int[] W) {
        int n = C.length;
        PriorityQueue<Node> PQ = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            Node T = new Node(C[i], W[i]);
            PQ.add(T);
        }
        for (int i = 0; i < n - 1; i++) {
            Node L = PQ.poll();
            Node R = PQ.poll();
            Node T = new Node('$', L.weight + R.weight);
            T.left = L;
            T.right = R;
            PQ.add(T);
        }
        return PQ.poll();
    }
}
public class Huffman_code {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'c', 'd', 'e'};
        int[] frequencies = {30, 25, 21, 14, 10};
        Node root = Huffman.buildHuffmanTree(characters, frequencies);
        HashMap<Character, String> codes = new HashMap<>();
        generateCodes(root, "", codes);
        System.out.println("Huffman Codes:");
        for (char c : codes.keySet()) {
            System.out.println(c + " : " + codes.get(c));
        }
    }
    private static void generateCodes(Node root, String code, HashMap<Character, String> codes) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            codes.put(root.ch, code);
        }
        generateCodes(root.left, code + "0", codes);
        generateCodes(root.right, code + "1", codes);
    }
}
