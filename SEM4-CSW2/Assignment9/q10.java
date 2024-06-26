package assignment9;

 import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class q10 {
public static void main(String[] args) {
LocalDateTime dateTime = LocalDateTime.of(2023, 3, 14, 15, 30, 0);
String format = "yyyy-MM-dd HH:mm:ss";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
String formattedDateTime = dateTime.format(formatter);
System.out.println("Formatted date and time: " + formattedDateTime);
}
}