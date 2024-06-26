package assignment7;

import java.io.File;
import java.util.Scanner;
public class q6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the file name to delete:");
String fileName = scanner.nextLine();
File file = new File(fileName);
if (file.exists()) {
	file.delete();

System.out.println("File deleted successfully.");
} else {
System.err.println("File not found.");
}
}
}


