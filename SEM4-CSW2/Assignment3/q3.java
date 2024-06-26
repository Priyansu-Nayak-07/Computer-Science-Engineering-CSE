package assignment3;
import java.util.*;
// Car class implementing Comparable interface to enable sorting based on stock
class Car implements Comparable<Car> {
    private int modalno;
    private String name;
    private int stock;
    // Constructor to initialize modalno, name, and stock
    public Car(int modalno, String name, int stock) {
        this.modalno = modalno;
        this.name = name;
        this.stock = stock;
    }
    // Getter and setter methods for modalno, name, and stock
    public int getModalno() {
        return modalno;
    }
    public void setModalno(int modalno) {
        this.modalno = modalno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    // compareTo method to compare Car objects based on stock
    public int compareTo(Car car) {
        if (this.stock == car.getStock()) {
            return 0;
        } else if (this.stock > car.getStock()) {
            return 1;
        } else {
            return -1;
        }
    }

    // toString method to return a string representation of Car object
    public String toString() {
        return modalno + " " + name + " " + stock;
    }
}

public class q3 {
    public static void main(String args[]) {
        // Creating an ArrayList to hold Car objects
        ArrayList<Car> carlist = new ArrayList<>();
        
        // Adding Car objects to the list
        carlist.add(new Car(2013, "creta", 10));
        carlist.add(new Car(2020, "MG", 13));
        carlist.add(new Car(2018, "Kia", 20));
        carlist.add(new Car(2017, "Audi", 45));
        carlist.add(new Car(2015, "BMW", 55));
        
        // Sorting the list of cars
        Collections.sort(carlist);
        
        // Printing the list of sorted car objects
        System.out.println("List of sorted car objects:");
        for (Car car : carlist) {
            System.out.println(car);
        }
    }
}
