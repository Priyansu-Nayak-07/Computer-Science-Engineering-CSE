package assignment10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class q9 {
private static final String FILE_PATH = "large_text_file.txt";
private static final int NUM_THREADS = 4;
public static void main(String[] args) {
Map<String, Integer> wordCountMap = new ConcurrentHashMap<>();
Thread[] threads = new Thread[NUM_THREADS];
for (int i = 0; i < NUM_THREADS; i++) {
threads[i] = new Thread(new FileProcessor(wordCountMap));
threads[i].start();
}
for (Thread thread : threads) {
try {
thread.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
int totalWordCount = mergeResults(wordCountMap);
System.out.println("Total word count: " + totalWordCount);
}
static class FileProcessor implements Runnable {
private final Map<String, Integer> wordCountMap;
FileProcessor(Map<String, Integer> wordCountMap) {
this.wordCountMap = wordCountMap;
}
public void run() {
try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
String line;
while ((line = reader.readLine()) != null) {
processLine(line);
}
} catch (IOException e) {
e.printStackTrace();
}
}
private void processLine(String line) {
String[] words = line.split("\\s+");
for (String word : words) {
wordCountMap.merge(word, 1, Integer::sum);
}
}
}
private static int mergeResults(Map<String, Integer> wordCountMap) {
return wordCountMap.values().stream().mapToInt(Integer::intValue).sum();

}
}