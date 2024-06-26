package assignment7;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for a diary entry
        System.out.println("Enter your diary entry:");
        String entry = scanner.nextLine();
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        // Check if the file already exists
        File file = new File("diary.txt");
        if (file.exists()) {
            System.out.println("Warning: 'diary.txt' already exists. Contents may be overwritten.");
        }
        // Write the entry to the file
        try (FileWriter writer = new FileWriter("diary.txt", true)) {
            writer.write(formattedDate + ": " + entry + "\n");
            System.out.println("Diary entry has been successfully written to diary.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
