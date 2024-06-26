package assignment2;
//Generic class Student with type parameter T
class Student<T> {
 // Attributes of the student
 private String name;
 private T roll; // Roll number can be of any type
 private int age;
 // Constructor to initialize the student attributes
 public Student(String name, T roll, int age) {
     this.name = name;
     this.roll = roll;
     this.age = age;
 }
 // Method to display student details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Roll: " + roll);
     System.out.println("Age: " + age);
     
 }
}
public class StudentDriver {
 public static void main(String[] args) {
     // Creating instances of Student with different types for roll
     Student<Integer> student1 = new Student<>("priyansu", 21, 18); // Roll number as Integer
     Student<String> student2 = new Student<>("shreyansu", "25", 19); // Roll number as String

     // Displaying details of student1
     System.out.println("Student 1 Details:");
     student1.displayDetails();
     System.out.println();

     // Displaying details of student2
     System.out.println("Student 2 Details:");
     student2.displayDetails();
 }
}
