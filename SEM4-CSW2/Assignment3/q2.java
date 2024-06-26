package assignment3;
import java.util.*;
// User class with name and age attributes
class User {
    private String name;
    private int age;
    // Constructor to initialize name and age
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter and setter methods for name and age
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
    }}
// ArrayListUser class to manage a list of User objects
class ArrayListUser {
    private ArrayList<User> users = new ArrayList<>();
    // Method to add a user to the list
    public void addUser(User user) {
        users.add(user);
    }
    // Method to print all users in the list
    public void printUsers() {
        System.out.println("Users:");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        } }
    // Method to sort users by age
    public void sortUsersByAge() {
        Collections.sort(users, Comparator.comparingInt(User::getAge));
    }
}

public class q2 {
    public static void main(String[] args) {
        // Create an instance of ArrayListUser
        ArrayListUser arrayListUser = new ArrayListUser();

        // Adding users to the list
        arrayListUser.addUser(new User("priyansu", 20));
        arrayListUser.addUser(new User("Subhankar", 19));
        arrayListUser.addUser(new User("Shreyanshu", 21));

        // Printing users before sorting
        arrayListUser.printUsers();

        // Sorting users by age
        arrayListUser.sortUsersByAge();

        // Printing sorted users
        System.out.println("\nUsers sorted by age:");
        arrayListUser.printUsers();
    }
}
