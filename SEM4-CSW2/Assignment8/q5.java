package assignment8;

import java.util.LinkedList;
import java.util.Queue;

// Class representing a node in the Binary Search Tree
class BNode {
    int info;
    BNode left, right;

    // Constructor to initialize the node with given info
    public BNode(int info) {
        this.info = info;
        left = right = null;
    }
}

// Class representing the Binary Search Tree
class BST {
    private BNode root;

    // Constructor to initialize an empty BST
    public BST() {
        root = null;
    }

    // Method to create a BST from a sorted array
    public void createTree(int[] arr) {
        root = createTreeRec(arr, 0, arr.length - 1);
    }

    // A recursive function to create a BST from a sorted array
    private BNode createTreeRec(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        BNode node = new BNode(arr[mid]);

        node.left = createTreeRec(arr, start, mid - 1);
        node.right = createTreeRec(arr, mid + 1, end);

        return node;
    }

    // Method to perform in-order traversal of the BST
    public void inorder() {
        inorderRec(root);
    }

    // A utility function to do in-order traversal of BST
    private void inorderRec(BNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.info + " ");
            inorderRec(root.right);
        }
    }

    // Method to perform pre-order traversal of the BST
    public void preorder() {
        preorderRec(root);
    }

    // A utility function to do pre-order traversal of BST
    private void preorderRec(BNode root) {
        if (root != null) {
            System.out.print(root.info + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Method to perform post-order traversal of the BST
    public void postorder() {
        postorderRec(root);
    }

    // A utility function to do post-order traversal of BST
    private void postorderRec(BNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.info + " ");
        }
    }

    // Method to perform level-order traversal of the BST
    public void levelOrder() {
        if (root == null) {
            return;
        }

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BNode node = queue.poll();
            System.out.print(node.info + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    // Method to find the node with the minimum value
    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.info;
    }

    // Method to find the node with the maximum value
    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.info;
    }

    // Main method to test the BST implementation
    public static void main(String[] args) {
        BST tree = new BST();

        // Create BST from sorted array
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        tree.createTree(sortedArray);

        // Print in-order traversal of the BST
        System.out.println("In-order traversal of the BST:");
        tree.inorder();
        System.out.println();

        // Print pre-order traversal of the BST
        System.out.println("Pre-order traversal of the BST:");
        tree.preorder();
        System.out.println();

        // Print post-order traversal of the BST
        System.out.println("Post-order traversal of the BST:");
        tree.postorder();
        System.out.println();

        // Print level-order traversal of the BST
        System.out.println("Level-order traversal of the BST:");
        tree.levelOrder();
        System.out.println();

        // Find and print the node with the minimum value
        System.out.println("Node with the minimum value:");
        System.out.println(tree.findMin());
        System.out.println();

        // Find and print the node with the maximum value
        System.out.println("Node with the maximum value:");
        System.out.println(tree.findMax());
        System.out.println();
    }
}
