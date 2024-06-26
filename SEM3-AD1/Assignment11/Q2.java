class TreeNode1 {
    int data;
    TreeNode1 left, right;
    public TreeNode1(int item) {
        data = item;
        left = right = null;
    }
}
public class Q2 {
    public static TreeNode1 findMinNode(TreeNode1 root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static TreeNode1 findMaxNode(TreeNode1 root) {
        if (root == null) {
            return null;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(5);
        root.left = new TreeNode1(3);
        root.right = new TreeNode1(8);
        root.left.left = new TreeNode1(2);
        root.left.right = new TreeNode1(4);
        root.right.left = new TreeNode1(6);
        root.right.right = new TreeNode1(9);

        TreeNode1 minNode = findMinNode(root);
        System.out.println("Node with minimum value: " + minNode.data);

        TreeNode1 maxNode = findMaxNode(root);
        System.out.println("Node with maximum value: " + maxNode.data);
    }
}
