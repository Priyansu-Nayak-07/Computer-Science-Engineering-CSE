package assignment10;

 import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class q5{
private static final int NUM_THREADS = 5;
private static final int NUM_INCREMENTS = 1000;
private static int counter = 0;
private static Lock lock = new ReentrantLock();
public static void main(String[] args) {
Thread[] threads = new Thread[NUM_THREADS];
for (int i = 0; i < NUM_THREADS; i++) {
threads[i] = new Thread(new CounterIncrementer());
threads[i].start();

}
for (Thread thread : threads) {
try {
thread.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Final Counter Value: " + counter);
}
static class CounterIncrementer implements Runnable {
@Override
public void run() {
for (int i = 0; i < NUM_INCREMENTS; i++) {
lock.lock();
try {
counter++;
} finally {
lock.unlock();
}
}
}
}
}