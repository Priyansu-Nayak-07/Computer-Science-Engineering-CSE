package assignment6;

class AnonymousObject {
String name;
public AnonymousObject(String name) {
this.name = name;
}
// Finalize method called by garbage collector
@Override
protected void finalize() throws Throwable {
System.out.println("Garbage collecting object: " + name);
}
}
public class q4 {
public static void main(String[] args) {
new AnonymousObject("Anonymous Object") {
// Overriding finalize() method for anonymous object
@Override
protected void finalize() throws Throwable {
super.finalize();
}
};
// Explicitly invoking the garbage collector
System.gc();
}
}