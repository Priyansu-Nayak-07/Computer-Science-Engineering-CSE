package assignment2;

//Animal class representing an animal with name, color, and type
class Animal {
 private String name;
 private String color;
 private String type;

 // Constructor to initialize animal attributes
 public Animal(String name, String color, String type) {
     this.name = name;
     this.color = color;
     this.type = type;
 }

 // Override hashCode method to generate unique hash code for Animal objects
 @Override
 public int hashCode() {
     // Create a unique ID based on object's fields
     return name.hashCode() + color.hashCode() + type.hashCode();
 }
}

public class Animals {
 public static void main(String[] args) {
     // Creating instances of Animal
     Animal lion = new Animal("Lion", "Yellow", "Wild");
     Animal panther = new Animal("Panther", "Black", "Wild"); // Fixed capitalization of "wild" to "Wild"
     Animal dog = new Animal("Dog", "White", "Pet");

     // Printing hash codes of the Animal objects
     System.out.println("Hash code for Lion: " + lion.hashCode());
     System.out.println("Hash code for Panther: " + dog.hashCode());
     System.out.println("Hash code for Dog: " + panther.hashCode());
 }
}
