import java.util.LinkedList;
import java.util.Queue;
public class Q2 {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("14");
        myQueue.offer("21");
        myQueue.offer("37");
        System.out.println("Queue: " + myQueue);
        String dequeuedElement = myQueue.poll();
        System.out.println("Dequeue: " + dequeuedElement);
        System.out.println("Queue after dequeue: " + myQueue);
    }
}