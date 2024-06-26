package assignment8;

import java.util.LinkedList;
import java.util.Queue;

// Class representing a country
class Country {
    private String name;
    private int population;

    // Constructor to initialize the country with a name and population
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    // Getters for the country's name and population
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    // Override toString() method for better readability
    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + "}";
    }
}

// Class representing a node in the Binary Search Tree
class BNode {
    Country info;
    BNode left, right;

    // Constructor to initialize the node with given info
    public BNode(Country info) {
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

    // Method to insert a node into the BST
    public void insert(Country info) {
        root = insertRec(root, info);
    }

    // A recursive function to insert a new node with given info in BST
    private BNode insertRec(BNode root, Country info) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new BNode(info);
            return root;
        }

        // Otherwise, recur down the tree
        if (info.getPopulation() < root.info.getPopulation()) {
            root.left = insertRec(root.left, info);
        } else if (info.getPopulation() > root.info.getPopulation()) {
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
    private void inorderRec(BNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.info);
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
            System.out.println(root.info);
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
            System.out.println(root.info);
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
            System.out.println(node.info);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    // Method to find the node with the minimum population
    public Country findMin() {
        if (root == null) {
            return null;
        }

        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.info;
    }

    // Method to find the node with the maximum population
    public Country findMax() {
        if (root == null) {
            return null;
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

        // Insert countries into the BST
        tree.insert(new Country("USA", 331002651));
        tree.insert(new Country("India", 1380004385));
        tree.insert(new Country("China", 1439323776));
        tree.insert(new Country("Brazil", 212559417));
        tree.insert(new Country("Nigeria", 206139589));

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

        // Find and print the node with the minimum population
        System.out.println("Country with the minimum population:");
        System.out.println(tree.findMin());
        System.out.println();

        // Find and print the node with the maximum population
        System.out.println("Country with the maximum population:");
        System.out.println(tree.findMax());
        System.out.println();
    }
}
