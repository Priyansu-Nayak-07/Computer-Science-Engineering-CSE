package assignment2;
//Class representing a Book
class Book {
 // Attributes of the book
 private int bookId;
 private String bookName;
 private double price;
 // Constructor to initialize the book attributes
 public Book(int bookId, String bookName, double price) {
     this.bookId = bookId;
     this.bookName = bookName;
     this.price = price;
 }
 // Method to get the price of the book
 public double getPrice() {
     return price;
 }
 // Method to represent the Book object as a String
 public String toString() {
     return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: " + price;
 }
 // Method to check equality of Book objects
 public boolean equals(Object obj) {
     if (this == obj)
         return true;
     if (obj == null || getClass() != obj.getClass())
         return false;
     Book book = (Book) obj;
     return bookId == book.bookId &&
             Double.compare(book.price, price) == 0 &&
             bookName.equals(book.bookName);
 }
}
public class BookDriver {
 public static void main(String[] args) {
     // Creating instances of Book
     Book book1 = new Book(1, "java", 10.0);
     Book book2 = new Book(2, "c++", 15.0);

     // Displaying details of Book 1 and Book 2
     System.out.println("Details of Book 1: " + book1.toString());
     System.out.println("Details of Book 2: " + book2.toString());
 }
}
