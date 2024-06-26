package assignment7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a new diary entry
        System.out.println("Enter your new diary entry:");
        String newEntry = scanner.nextLine();

        // Get the current timestamp
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Append the new entry to the file
        try (FileWriter writer = new FileWriter("diary.txt", true)) {
            writer.write("\n" + formattedDateTime + ": " + newEntry);
            System.out.println("New diary entry has been successfully appended to diary.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
