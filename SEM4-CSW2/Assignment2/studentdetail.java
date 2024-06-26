package assignment2;
//Student.java
class stu implements Comparable<stu> {
private String name;
private int rn; // Roll number
private int totalMark;

// Constructor
public stu(String name, int rn, int totalMark) {
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
public int compareTo(stu otherStudent) {
   if (this.rn == otherStudent.rn) {
       return 0;
   } else if (this.rn > otherStudent.rn) {
       return 1;
   } else {
       return -1;
   }
}
}
//StudentSearch.java
public class studentdetail {
// Method to perform linear search on an array of students
public static stu linearSearch(stu[] students, int rollNumber) {
   for (stu student : students) {
       if (student.getRollNumber() == rollNumber) {
           return student;
       }
   }
   return null; // Return null if student with the given roll number is not found
}

public static void main(String[] args) {
   // Creating an array of student objects
   stu[] students = {
       new stu("John", 101, 85),
       new stu("Alice", 102, 90),
       new stu("Bob", 103, 88)
   };

   // Searching for a student with roll number 102
   int rollNumberToSearch = 102;
   stu foundStudent = linearSearch(students, rollNumberToSearch);

   // Displaying the result
   if (foundStudent != null) {
       System.out.println("Student found:");
       System.out.println("Name: " + foundStudent.getName());
       System.out.println("Roll Number: " + foundStudent.getRollNumber());
       System.out.println("Total Marks: " + foundStudent.getTotalMark());
   } else {
       System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
   }
}
}


