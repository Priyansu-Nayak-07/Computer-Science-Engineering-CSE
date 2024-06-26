class Q1 {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    Q1(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear < maxSize - 1) {
            queueArray[++rear] = value;
            System.out.println("Enqueued: " + value);
        } else {
            System.out.println("Queue is full. Cannot enqueue " + value);
        }
    }

    public int dequeue() {
        if (front <= rear) {
            int dequeuedValue = queueArray[front++];
            System.out.println("Then");
            System.out.println("Dequeued: " + dequeuedValue);
            return dequeuedValue;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Q1 queue = new Q1(3);

        queue.enqueue(40);
        queue.enqueue(60);
        queue.enqueue(70);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.dequeue();
    }
}