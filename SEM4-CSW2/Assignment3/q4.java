package assignment3;
import java.util.*;

//Student class with name, age, and mark attributes
class Student {
 private String name;
 private int age;
 private double mark;

 // Constructor to initialize name, age, and mark
 public Student(String name, int age, double mark) {
     this.name = name;
     this.age = age;
     this.mark = mark;
 }

 // Getters and setters for name, age, and mark
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public double getMark() {
     return mark;
 }

 public void setMark(double mark) {
     this.mark = mark;
 }

 // Override equals method to compare Student objects
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Student student = (Student) obj;
     return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
 }

 // Override toString method to provide string representation of Student object
 @Override
 public String toString() {
     return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
 }
}

public class q4 {
 public static void main(String[] args) {
     // Creating a LinkedList to hold Student objects
     LinkedList<Student> studentList = new LinkedList<>();
     Scanner scanner = new Scanner(System.in);

     // Adding students to the list
     studentList.add(new Student("subhojeet", 20, 85.5));
     studentList.add(new Student("himanshu ", 21, 88.0));
     studentList.add(new Student("priyansu", 19, 95.2));
     studentList.add(new Student("pragyan", 20, 80.2));
     

     // Displaying the list of students
     System.out.println("Student List:");
     displayList(studentList);

     // Getting details of a student to search
     System.out.println("Enter details of the Student to search:");
     System.out.print("Name: ");
     String shName = scanner.nextLine();
     System.out.print("Age: ");
     int shAge = scanner.nextInt();
     System.out.print("Mark: ");
     double shMark = scanner.nextDouble();
     Student searchStudent = new Student(shName, shAge, shMark);

     // Checking if the list contains the specified student
     boolean contains = studentList.contains(searchStudent);
     System.out.println("The list " + (contains ? "contains" : "does not contain") + " the specified student.");

     // Removing the specified student from the list
     studentList.remove(searchStudent);
     System.out.println("After removing the student:");
     displayList(studentList);

     // Displaying the number of students in the list
     System.out.println("Number of students in the list: " + studentList.size());

     scanner.close();
 }

 // Method to display the list of students
 private static void displayList(LinkedList<Student> list) {
     for (Student student : list) {
         System.out.println(student);
     }
 }
}
