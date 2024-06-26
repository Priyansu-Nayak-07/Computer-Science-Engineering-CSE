package assignment7;

import java.io.File;
import java.util.Scanner;
public class q10 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the directory path:");
String directoryPath = scanner.nextLine();
File directory = new File(directoryPath);
if (!directory.exists() || !directory.isDirectory()) {
System.err.println("Invalid directory path.");
return;
}
listFiles(directory, "");
}
private static void listFiles(File directory, String indent) {
File[] files = directory.listFiles();
for (File file : files) {
if (file.isDirectory()) {
System.out.println(indent + "Directory: " + file.getName());
listFiles(file, indent + " ");
} else {
System.out.println(indent + "File: " + file.getName());
}
}
}
}