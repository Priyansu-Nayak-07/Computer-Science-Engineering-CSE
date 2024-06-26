package assignment7;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Error: The specified file does not exist or is not a file.");
            return;
        }
        System.out.println("File Metadata:");
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date lastModifiedDate = new Date(file.lastModified());
        String formattedDate = dateFormat.format(lastModifiedDate);
        System.out.println("Last Modified: " + formattedDate);

        System.out.println("Is Readable: " + file.canRead());
        System.out.println("Is Writable: " + file.canWrite());
        System.out.println("Is Hidden: " + file.isHidden());
    }
}
