package assignment2;
//Student.java
class STU implements Comparable<STU> {
 private String name;
 private int rn; // Roll number
 private int totalMark;

 // Constructor
 public STU(String name, int rn, int totalMark) {
     this.name = name;
     this.rn = rn;
     this.totalMark = totalMark;
 }
 // Getter methods
 public String getName() {
     return name;
 }
 public int getRollNumber() {
     return rn;
 }
 public int getTotalMark() {
     return totalMark;
 }
 // Override compareTo method to compare students based on roll number
 @Override
 public int compareTo(STU otherStudent) {
     if (this.rn == otherStudent.rn) {
         return 0;
     } else if (this.rn > otherStudent.rn) {
         return 1;
     } else {
         return -1;
     }
 }
}
//StudentSorter.java
public class studentdet {
// Method to sort an array of students using Bubble sort
public static void bubbleSort(STU[] students) {
  int n = students.length;
  for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
          // If current student's roll number is greater than the next student's roll number, swap them
          if (students[j].compareTo(students[j + 1]) > 0) {
        	  STU temp = students[j];
              students[j] = students[j + 1];
              students[j + 1] = temp;
          }
      }
  }
}

public static void main(String[] args) {
  // Creating an array of student objects
	STU[] students = {
      new STU("John", 102, 85),
      new STU("Alice", 101, 90),
      new STU("Bob", 103, 88)
  };

  // Sorting the array of students
  bubbleSort(students);

  // Displaying the sorted list of students
  System.out.println("Sorted list of students:");
  for (STU student : students) {
      System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Total Marks: " + student.getTotalMark());
  }
}
}
