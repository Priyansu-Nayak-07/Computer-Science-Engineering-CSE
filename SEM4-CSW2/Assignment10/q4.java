package assignment10;

public class q4 {
private static final int MAX_NUM = 10;
private static final Object lock = new Object();
private static int count = 1;
public static void main(String[] args) {
Thread evenThread = new Thread(new EvenPrinter());
Thread oddThread = new Thread(new OddPrinter());
evenThread.start();
oddThread.start();
}
static class EvenPrinter implements Runnable {
@Override
public void run() {
while (count <= MAX_NUM) {
synchronized (lock) {
while (count % 2 != 0) {
try {

lock.wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Even: " + count);
count++;
lock.notify();
}
}
}
}
static class OddPrinter implements Runnable {
@Override
public void run() {
while (count <= MAX_NUM) {
synchronized (lock) {
while (count % 2 == 0) {
try {
lock.wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Odd: " + count);
count++;
lock.notify();
}
}
}
}
}