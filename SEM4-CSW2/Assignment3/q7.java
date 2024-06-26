package assignment3;
import java.util.*;

//Address class representing an address with plot number, area, and postal information
class Address {
 private int plotno;
 private String at;
 private String post;
 
 // Constructor to initialize Address object
 public Address(int plotno, String at, String post) {
     this.plotno = plotno;
     this.at = at;
     this.post = post;
 }

 // toString method to return a string representation of Address object
 @Override
 public String toString() {
     return "Address [plotno=" + plotno + ", at=" + at + ", post=" + post + "]";
 }
}

public class q7 {
 public static void main(String args[]) {
     // Creating a TreeMap to hold address information with names as keys
     TreeMap<String, Address> addressbook = new TreeMap<>();

     // Inserting data into the TreeMap
     addressbook.put("priyansu", new Address(123, "collector residence", "bhadrak"));
     addressbook.put("Shreyansu", new Address(56, "Town hall", "bhadrak"));
     addressbook.put("Subhankar", new Address(89, "aradi chhak", "bhadrak"));

     // Displaying contents using an iterator
     Iterator<Map.Entry<String, Address>> iterator = addressbook.entrySet().iterator();
     while (iterator.hasNext()) {
         Map.Entry<String, Address> entry = iterator.next();
         String name = entry.getKey();
         Address address = entry.getValue();
         System.out.println(name + ": " + address);
     }
 }
}
