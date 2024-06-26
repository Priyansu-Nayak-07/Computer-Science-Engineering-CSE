package assignment9;
public class q8 {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hello, CSW2! from thread : "+Thread.currentThread().getName());
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
