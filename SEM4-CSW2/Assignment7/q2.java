package assignment7;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        // Check if the file exists
        File file = new File("diary.txt");
        if (!file.exists()) {
            System.out.println("Error: 'diary.txt' does not exist.");
            return;
        }

        // Read and display the content of the file
        try (Scanner sc = new Scanner(file)) {
            System.out.println("Contents of diary.txt:");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }
}
