import java.util.*;

class Ll {
    Node head;
    int size = 0;
 
    class Node{
        int data;
        Node next;

        Node(int x) 
        {
            data = x;
            next = null;
        }
    }
    public void insert(int data)
    {
        Node new_node = new Node(data);

        new_node.data = data;
        new_node.next = head;
        head = new_node;
        size++;
    }
    public void deletePosition(int pos) {
        Node temp = head;
        Node prevNode = null;

        if(pos < 1 || pos > size){
            System.out.println("Invalid\n");
            return;
        }

        // delete the 1st node
        if(pos == 1){
            head = head.next;
            System.out.println("Deleted: " + temp.data);
            size--;
            return;
        }

        while (--pos > 0)
        {
            prevNode = temp;
            temp = temp.next;
        }
        
        prevNode.next = temp.next;
       
        System.out.println("Deleted: " + temp.data);
        size--;
    }

    public void display()
    {
        System.out.print("Linked List : ");

        Node node = head;
        
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
    public class Q3{
    public static void main(String args[])
    {
        Ll linked_list = new Ll();

        linked_list.insert(5);
        linked_list.insert(4);
        linked_list.insert(3);
        linked_list.insert(2);
        linked_list.insert(1);

        linked_list.display();

       
        linked_list.deletePosition(1);
        linked_list.display();

       
        linked_list.deletePosition(4);
        linked_list.display();
    }


}
