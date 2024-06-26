
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
  static class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
      this.data = data;
      this.right = null;
      this.left = null;
    }
  }

  static class BinaryTree {

    public static Node buildTree(Node root, int nodes[], int left, int right) {
      if (nodes.length == 0)
        return null;
      if (left > right)
        return null;

      int mid = left + (right - left) / 2;

      if (root == null) {
        root = new Node(nodes[mid]);
        buildTree(root, nodes, left, right);
      }

      root.left = buildTree(root.left, nodes, left, mid - 1);
      root.right = buildTree(root.right, nodes, mid + 1, right);

      return root;

    }

    public static void printInOrder(Node root) {
      if (root == null) {
        System.out.print("." + " ");
        return;
      }

      printInOrder(root.left);
      System.out.print(root.data + " ");
      printInOrder(root.right);
    }

    public static void printPreOrder(Node root) {
      if (root == null) {
        System.out.print("." + " ");
        return;
      }

      System.out.print(root.data + " ");
      printPreOrder(root.left);
      printPreOrder(root.right);
    }

    public static int search(Node root, int key){
      if(root == null) return -1;

      if(root.data == key) return 1;
      else if(root.data < key) return search(root.right, key);
      else return search(root.left, key);
    }
  }

  public static void main(String[] args) {
    int nodes[] = { 5, 1, 3, 4, 2, 7 };
    Arrays.sort(nodes);
    BinaryTree tree = new BinaryTree();
    Node root = null;
    root = tree.buildTree(root, nodes, 0, nodes.length - 1);
    tree.printInOrder(root);
    System.out.println();
    tree.printPreOrder(root);
    int idx = tree.search(root, 6);
    if(idx != -1) System.out.println("Found");
    else System.out.println("Not Found");
  }
}
