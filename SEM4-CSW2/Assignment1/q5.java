package assignment1;
class College {
 private String collegeName;
 private String collegeLoc;
 public College(String collegeName, String collegeLoc) {
     this.collegeName = collegeName;
     this.collegeLoc = collegeLoc;
 }
 public String getCollegeName() {
     return collegeName;
 }

 public String getCollegeLoc() {
     return collegeLoc;
 }
}
class Student {
private int studentId;
private String studentName;
private College college;

public Student(int studentId, String studentName, College college) {
  this.studentId = studentId;
  this.studentName = studentName;
  this.college = college;
}

public void displayStudentInfo() {
  System.out.println("Student ID: " + studentId);
  System.out.println("Student Name: " + studentName);
  System.out.println("College: " + college.getCollegeName());
  System.out.println("Location: " + college.getCollegeLoc());
}
}
public class q5 {
public static void main(String[] args) {
   College college1 = new College("ITER", "KHANDAGIRI");
   College college2 = new College("KIIT", "PATIA");
   Student student1 = new Student(121, "priyansu", college1);
   Student student2 = new Student(211, "ppb", college2);
   System.out.println("Student 1 Information:");
   student1.displayStudentInfo();
   System.out.println();

   System.out.println("Student 2 Information:");
   student2.displayStudentInfo();

}
}


