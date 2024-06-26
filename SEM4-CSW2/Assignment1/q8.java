package assignment1;
import java.util.Scanner;

interface Vehicle {
 void accelerate();
 void brake();
}
class CARS implements Vehicle {
 @Override
 public void accelerate() {
     System.out.println("Car is accelerating.");
 }

 @Override
 public void brake() {
     System.out.println("Car is braking.");
 }
 public void accelerate(int speed) {
     System.out.println("Car is accelerating at speed: " + speed + " km/h");
 }
 public void accelerate(int speed, int duration) {
     System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
 }
}
class Bicycle implements Vehicle {
 @Override
 public void accelerate() {
     System.out.println("Bicycle is pedaling faster.");
 }

 @Override
 public void brake() {
     System.out.println("Bicycle is applying brakes.");
 }
 public void accelerate(int speed) {
     System.out.println("Bicycle is pedaling faster at speed: " + speed + " km/h");
 }

 public void accelerate(int speed, int duration) {
     System.out.println("Bicycle is pedaling faster at speed: " + speed + " km/h for " + duration + " seconds");
 }
}

//Main.java - Main class to demonstrate the program
public class q8 {
 public static void main(String[] args) {

     CARS car = new CARS();
     Bicycle bicycle = new Bicycle();

     car.accelerate();
     car.brake();
     car.accelerate(20);
     car.accelerate(20, 10);
     System.out.println();
     bicycle.accelerate();
     bicycle.brake();
     bicycle.accelerate(15);
     bicycle.accelerate(15, 15);

 }
}
