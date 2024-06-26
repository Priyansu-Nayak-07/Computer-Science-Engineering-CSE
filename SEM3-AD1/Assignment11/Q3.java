class TreeNode2 {
    int data;
    TreeNode2 left, right;
    public TreeNode2(int item) {
        data = item;
        left = right = null;
    }
}
public class Q3 {
    public static TreeNode2 deleteNode(TreeNode2 root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    public static int minValue(TreeNode2 root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    public static void inOrderTraversal(TreeNode2 root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(5);
        root.left = new TreeNode2(3);
        root.right = new TreeNode2(8);
        root.left.left = new TreeNode2(2);
        root.left.right = new TreeNode2(4);
        root.right.left = new TreeNode2(6);
        root.right.right = new TreeNode2(9);
        System.out.println("Original BST:");
        inOrderTraversal(root);
        int keyToDelete = 8;
        root = deleteNode(root, keyToDelete);
        System.out.println("\nBST after deleting node with value " + keyToDelete + ":");
        inOrderTraversal(root);
    }
}