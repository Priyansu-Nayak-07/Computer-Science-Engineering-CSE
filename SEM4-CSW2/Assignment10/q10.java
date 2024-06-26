package assignment10;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class q10 {
private static final int NUM_THREADS = 4;
public static void main(String[] args) {
List<String> imagePaths = new ArrayList<>();
imagePaths.add("image1.jpg");
imagePaths.add("image2.jpg");
imagePaths.add("image3.jpg");
ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
for (String imagePath : imagePaths) {
executor.submit(new ImageProcessingTask(imagePath));
}
executor.shutdown();
}
static class ImageProcessingTask implements Runnable {
private final String imagePath;
ImageProcessingTask(String imagePath) {
this.imagePath = imagePath;
}
public void run() {
processImage(imagePath);
}
private void processImage(String imagePath) {
System.out.println("Processing image: " + imagePath);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("Image processing completed: " + imagePath);
}
}
}