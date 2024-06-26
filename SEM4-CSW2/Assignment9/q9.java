package assignment9;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.*;
public class q9 {
public static void main(String[] args) {
BlockingQueue<Integer> buffer = new LinkedBlockingQueue<>(10);
for (int i = 0; i < 5; i++) {
Thread producerThread = new Thread(() -> {
try {
int item = (int) (Math.random() * 100);
System.out.println("Produced: " + item);
buffer.put(item);
TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
} catch (InterruptedException e) {
e.printStackTrace();
}
});
producerThread.start();
}
for (int i = 0; i < 3; i++) {
Thread consumerThread = new Thread(() -> {
while (true) {
try {
int item = buffer.take();
System.out.println("Consumed: " + item);
TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 2000));
} catch (InterruptedException e) {
e.printStackTrace();
}
}
});
consumerThread.start();
}
}
}