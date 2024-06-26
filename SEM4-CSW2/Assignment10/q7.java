package assignment10;

 import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class q7 {
public static void main(String[] args) {
CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
System.out.println("Task 1 started");
Random random = new Random();
int result = random.nextInt(1000);
System.out.println("Task 1 completed with result: " + result);
return result;
});
CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
System.out.println("Task 2 started");
Random random = new Random();
int result = random.nextInt(1000);
System.out.println("Task 2 completed with result: " + result);
return result;
});
CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (r1, r2) -> r1 + r2);
try {
System.out.println("Combined result: " + combinedFuture.get());
} catch (InterruptedException | ExecutionException e) {
e.printStackTrace();
}
}
}