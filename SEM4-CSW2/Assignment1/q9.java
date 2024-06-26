package assignment1;

import java.util.*;
interface EnrollmentSystem {
    void enrollStudent(STU student, Course course);
    void dropStudent(STU student, Course course);
    void displayEnrollmentDetails();
}
class STU {
 private String studentId;
 private String studentName;
 public STU(String studentId, String studentName) {
     this.studentId = studentId;
     this.studentName = studentName;
 }
 public String getStudentId() {
     return studentId;
 }
 public String getStudentName() {
     return studentName;
 }
}
class Course {
    private String courseId;
    private String courseName;
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public String getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
}
class Enrollment implements EnrollmentSystem {
    private List<STU> enrolledStudents;
    private List<Course> enrolledCourses;
    public Enrollment() {
        enrolledStudents = new ArrayList<>();
        enrolledCourses = new ArrayList<>();
    }

    @Override
    public void enrollStudent(STU student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println("Student " + student.getStudentName() + " enrolled in course " + course.getCourseName());
    }

    @Override
    public void dropStudent(STU student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println("Student " + student.getStudentName() + " dropped from course " + course.getCourseName());
        } else {
            System.out.println("Student " + student.getStudentName() + " is not enrolled in course " + course.getCourseName());
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println("Student: " + enrolledStudents.get(i).getStudentName() +
                               ", Course: " + enrolledCourses.get(i).getCourseName());
        }
    }
}

// Main class to demonstrate the system's functionality
public class q9 {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new Enrollment();
        
        STU student1 = new STU("S001", "Alice");
        STU student2 = new STU("S002", "Bob");

        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Data Structures");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.enrollStudent(student1, course2); // Trying to enroll same student in another course

        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student2, course2);
        enrollmentSystem.displayEnrollmentDetails();
    }
}
