package assignment6;

import java.lang.management.ManagementFactory;
import java.util.concurrent.ThreadLocalRandom;
class DataMembers {
private int intValue;
private double doubleValue;
public void initialize(int intVal, double doubleVal) {
this.intValue = intVal;
this.doubleValue  = doubleVal;
}
public void setIntValue(int intVal) {
intValue = intVal;
}
public void setDoubleValue(double doubleVal) {
doubleValue = doubleVal;
}
public int getIntValue() {
return intValue;
}
public double getDoubleValue() {
return doubleValue;
}
}
public class q5 {
public static void main(String[] args) {
Runtime runtime = Runtime.getRuntime();
// Calculate the total memory allocated
long totalMemory = runtime.totalMemory();
// Create two objects of the DataMembers class
DataMembers obj1 = new DataMembers();
DataMembers obj2 = new DataMembers();
// Set or update the data members using methods
obj1.initialize(ThreadLocalRandom.current().nextInt(100), ThreadLocalRandom.current().nextDouble());
obj2.initialize(ThreadLocalRandom.current().nextInt(100), ThreadLocalRandom.current().nextDouble());
// Make the objects unreachable
obj1 = null;
obj2 = null;
// Run the garbage collector
runtime.gc();
// Calculate the memory occupied by the objects
long usedMemory = runtime.totalMemory() - runtime.freeMemory();
System.out.println("Total memory allocated: " + totalMemory + " bytes");
System.out.println("Memory occupied by objects: " + usedMemory + " bytes");
}
}