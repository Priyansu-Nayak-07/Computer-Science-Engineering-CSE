package assignment8;
class BSTNode {
 int info;
 BSTNode left, right;

 // Constructor to initialize the node with given info
 public BSTNode(int info) {
     this.info = info;
     left = right = null;
 }
}

//Class representing the Binary Search Tree
class BST {
 private BSTNode root;

 // Constructor to initialize an empty BST
 public BST() {
     root = null;
 }

 // Method to insert a node into the BST
 public void insert(int info) {
     root = insertRec(root, info);
 }

 // A recursive function to insert a new node with given info in BST
 private BSTNode insertRec(BSTNode root, int info) {
     // If the tree is empty, return a new node
     if (root == null) {
         root = new BSTNode(info);
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

 // Method to perform in-order traversal of the BST
 public void inorder() {
     inorderRec(root);
 }

 // A utility function to do in-order traversal of BST
 private void inorderRec(BSTNode root) {
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
 private void preorderRec(BSTNode root) {
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
 private void postorderRec(BSTNode root) {
     if (root != null) {
         postorderRec(root.left);
         postorderRec(root.right);
         System.out.print(root.info + " ");
     }
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
 }
}
