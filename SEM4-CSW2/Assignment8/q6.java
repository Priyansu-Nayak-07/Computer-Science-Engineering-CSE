package assignment8;

//Class representing a node in the Binary Search Tree
class BNode {
 int info;
 BNode left, right;

 // Constructor to initialize the node with given info
 public BNode(int info) {
     this.info = info;
     left = right = null;
 }
}

//Class representing the Binary Search Tree
class BST {
 private BNode root;

 // Constructor to initialize an empty BST
 public BST() {
     root = null;
 }

 // Method to insert a node into the BST
 public void insert(int info) {
     root = insertRec(root, info);
 }

 // A recursive function to insert a new node with given info in BST
 private BNode insertRec(BNode root, int info) {
     // If the tree is empty, return a new node
     if (root == null) {
         root = new BNode(info);
         return root;
     }

     // Otherwise, recur down the tree
     if (info < root.info) {
         root.left = insertRec(root.left, info);
     } else if (info > root.info) {
         root.right = insertRec(root.right, info);
     }

     // Return the unchanged root node
     return root;
 }

 // Method to check if the tree is a BST
 public boolean isBST() {
     return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
 }

 // A utility function to check if the tree is a BST
 private boolean isBSTUtil(BNode node, int min, int max) {
     // An empty tree is a BST
     if (node == null) {
         return true;
     }

     // False if this node violates the min/max constraint
     if (node.info < min || node.info > max) {
         return false;
     }

     // Otherwise, check the subtrees recursively, tightening the min/max constraint
     return (isBSTUtil(node.left, min, node.info - 1) && isBSTUtil(node.right, node.info + 1, max));
 }

 // Main method to test the BST implementation
 public static void main(String[] args) {
     BST tree = new BST();

     // Insert nodes into the BST
     tree.insert(50);
     tree.insert(30);
     tree.insert(20);
     tree.insert(40);
     tree.insert(70);
     tree.insert(60);
     tree.insert(80);

     // Check if the tree is a BST
     if (tree.isBST()) {
         System.out.println("The tree is a binary search tree.");
     } else {
         System.out.println("The tree is not a binary search tree.");
     }

     // Create a non-BST for testing
     BNode root = new BNode(10);
     root.left = new BNode(5);
     root.right = new BNode(20);
     root.left.left = new BNode(2);
     root.left.right = new BNode(25); // This violates the BST property

     BST nonBSTTree = new BST();
     nonBSTTree.root = root;

     // Check if the non-BST tree is a BST
     if (nonBSTTree.isBST()) {
         System.out.println("The tree is a binary search tree.");
     } else {
         System.out.println("The tree is not a binary search tree.");
     }
 }
}
