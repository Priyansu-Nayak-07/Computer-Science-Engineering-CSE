public class StringTree {
    Node root = null;
    class Node {
        String value;
        int count;
        Node lChild;
        Node rChild;
    }
    public void print() {
        print(root);
    }
    public void print(Node curr) {
        if (curr != null) {
            System.out.print("value is :" + curr.value);
            System.out.println("Count is : " + curr.count);
            print(curr.lChild);
            print(curr.rChild);
        }
    }
    public void add(String value) {
        root = add(value, root);
    }
    Node add(String value, Node curr) {
        int compare;
        if (curr == null) {
            curr = new Node();
            curr.value = value;
            curr.lChild = curr.rChild = null;
            curr.count = 1;
        } else {
            compare = curr.value.compareTo(value);
            if (compare == 0)
                curr.count++;
            else if (compare == 1)
                curr.lChild = add(value, curr.lChild);
            else
                curr.rChild = add(value, curr.rChild);
        }
        return curr;
    }
    boolean find(String value) {
        boolean ret = find(root, value);
        System.out.println("Find " + value + " Return " + ret);
        return ret;
    }
    boolean find(Node curr, String value) {
        int compare;
        if (curr == null)
            return false;
        compare = curr.value.compareTo(value);
        if (compare == 0)
            return true;
        else {
            if (compare == 1)
                return find(curr.lChild, value);
            else
                return find(curr.rChild, value);
        }
    }
    int frequency(String value) {
        return frequency(root, value);
    }
    int frequency(Node curr, String value) {
        int compare;
        if (curr == null)
            return 0;
        compare = curr.value.compareTo(value);
        if (compare == 0)
            return curr.count;
        else {
            if (compare > 0)
                return frequency(curr.lChild, value);
            else
                return frequency(curr.rChild, value);
        }
    }
    void freeTree() {
        root = null;
    }
    public static void main(String[] args) {
        StringTree tree = new StringTree();
        tree.add("apple");
        tree.add("banana");
        tree.add("banana");
        tree.add("orange");
        tree.print();
        System.out.println("");
        tree.find("apple");
        tree.find("grape");
        System.out.println("");
        System.out.println("Frequency of 'apple': " + tree.frequency("apple"));
        System.out.println("Frequency of 'banana': " + tree.frequency("banana"));
        System.out.println("Frequency of 'orange': " + tree.frequency("orange"));
        tree.freeTree();
    }

}
