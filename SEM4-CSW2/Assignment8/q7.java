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

 // Method to delete a node from the BST
 public void delete(int info) {
     root = deleteRec(root, info);
 }

 // A recursive function to delete a node with given info in BST
 private BNode deleteRec(BNode root, int info) {
     // Base case: if the tree is empty
     if (root == null) {
         return root;
     }

     // Recur down the tree
     if (info < root.info) {
         root.left = deleteRec(root.left, info);
     } else if (info > root.info) {
         root.right = deleteRec(root.right, info);
     } else {
         // Node with only one child or no child
         if (root.left == null) {
             return root.right;
         } else if (root.right == null) {
             return root.left;
         }

         // Node with two children: get the in-order successor (smallest in the right subtree)
         root.info = minValue(root.right);

         // Delete the in-order successor
         root.right = deleteRec(root.right, root.info);
     }

     return root;
 }

 // Method to find the minimum value in the BST
 private int minValue(BNode root) {
     int minValue = root.info;
     while (root.left != null) {
         root = root.left;
         minValue = root.info;
     }
     return minValue;
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

     // Delete a node with no children (leaf node)
     System.out.println("Deleting node 20:");
     tree.delete(20);
     tree.inorder();
     System.out.println();

     // Delete a node with one child
     System.out.println("Deleting node 30:");
     tree.delete(30);
     tree.inorder();
     System.out.println();

     // Delete a node with two children
     System.out.println("Deleting node 50:");
     tree.delete(50);
     tree.inorder();
     System.out.println();
 }
}
