package assignment2;
class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    // Constructor
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    // Override compareTo method to compare cars based on speed
    @Override
    public int compareTo(Car otherCar) {
        if (this.speed == otherCar.speed) {
            return 0;
        } else if (this.speed > otherCar.speed) {
            return 1;
        } else {
            return -1;
        }
    }
}
// Driver.java
public class carDriver  {
    public static void main(String[] args) {
        // Creating two car objects
        Car car1 = new Car("Mustang", "Black", 300);
        Car car2 = new Car("BMW", "blue", 200);

        // Comparing cars based on speed
        Car fasterCar = (car1.compareTo(car2) > 0) ? car1 : car2;
        System.out.println("Details of the faster car:");
        System.out.println("Model: " + fasterCar.getModel());
        System.out.println("Color: " + fasterCar.getColor());
        System.out.println("Speed: " + fasterCar.getSpeed());
    }
}


