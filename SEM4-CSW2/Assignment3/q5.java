package assignment3;
import java.util.*;
//Book class representing a book with id, name, author, and quantity attributes
class Book {
 private int id;
 private String name;
 private String author;
 private int quantity; 
 // Constructor to initialize Book object
 public Book(int id, String name, String author, int quantity) {
     this.id = id;
     this.name = name;
     this.author = author;
     this.quantity = quantity;
 }
 // Getter and setter methods for id, name, author, and quantity
 public int getId() {
     return id;
 }
 public void setId(int id) {
     this.id = id;
 }
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public int getQuantity() {
     return quantity;
 }

 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }

 // toString method to return a string representation of Book object
 @Override
 public String toString() {
     return "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
 }
}

public class q5 {
 // Method to check if a book with given name is present in the HashMap
 public static boolean BookPresent(HashMap<Integer, Book> map, String bookName) {
     for (Book book : map.values()) {
         if (book.getName().equals(bookName)) {
             return true;
         }
     }
     return false;
 }
 
 // Main method to demonstrate book operations
 public static void main(String[] args) {
     // Creating a HashMap to hold Book objects
     HashMap<Integer, Book> bookhash = new HashMap<>();
     Scanner sc = new Scanner(System.in);
     
     // Creating Book objects and adding them to the HashMap
     Book book1 = new Book(1, "Java", "John Doe", 5);
     Book book2 = new Book(2, "HTML", "Priyansu", 10);
     bookhash.put(book1.getId(), book1);
     bookhash.put(book2.getId(), book2);
     
     // Displaying books in the library
     System.out.println("Books in the Library:");
     for (Book book : bookhash.values()) {
         System.out.println(book);
     }
     
     // Searching for a book
     System.out.print("Enter the name of the book to search: ");
     String search = sc.nextLine();
     if (BookPresent(bookhash, search)) {
         System.out.println(search + " is present in the library.");
     } else {
         System.out.println(search + " is not present in the library.");
     }
     
     // Removing a book
     System.out.print("Enter id of book to remove: ");
     int remove = sc.nextInt(); 
     if (bookhash.containsKey(remove)) {
         bookhash.remove(remove);
         System.out.println("Book with ID " + remove + " removed from the library.");
     } else {
         System.out.println("Book with ID " + remove + " not found in the library.");
     }
     
     // Displaying books in the library after removal
     System.out.println("Books in the library after removal:");
     for (Book book : bookhash.values()) {
         System.out.println(book);
     }
     
     sc.close(); // Closing scanner
 }
}
