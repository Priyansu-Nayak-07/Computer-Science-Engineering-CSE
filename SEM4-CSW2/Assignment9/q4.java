package assignment9;

interface Shape {
double area(double a, double b);
}
public class q4 {
public static void main(String[] args) {
Shape circle = (a,b) -> Math.PI *a*b;
Shape square = (a,b) -> a*b;
Shape rectangle = (a,b) -> a * b;

System.out.println("area :"+ circle.area(4,4));
System.out.println("area :"+ square.area(5,5));
System.out.println("area :"+ rectangle.area(5,3));
}
}