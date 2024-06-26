package assignment7;

import java.io.File;
import java.util.Scanner;
public class q4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the directory path:");
String directoryPath = scanner.nextLine();
File directory = new File(directoryPath);
if (!directory.exists()) {
System.out.println("The directory does not exist.");
return;
}
if (!directory.isDirectory()) {
System.out.println("The given path is not a directory.");
return;
}
File[] files = directory.listFiles();
for (File file : files) {
if (file.isFile()) {
System.out.println("File: " + file.getName());
} else if (file.isDirectory()) {
System.out.println("Directory: " + file.getName());
}
}
}
}