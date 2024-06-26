class Node {
        int data;
        Node next;
        
        Node(int data1, Node next1) {
            data = data1;
            next = next1;
        }
       
        Node(int data1) {
            data = data1;
            next = null;
        }
}
public class Q4{
    public static void main(String[] args) {
       
        int[] arr = {2, 5, 9, 7};
        
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
       
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
