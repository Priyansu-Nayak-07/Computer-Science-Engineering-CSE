  package assignment6;

class ReassigningReference {
String name;
public ReassigningReference(String name) {
this.name = name;
}
protected void finalize() throws Throwable {
System.out.println("Garbage collecting object: " + name);
}
}
public class q2 {
public static void main(String[] args) {
ReassigningReference r1 = new ReassigningReference("Object 1");
ReassigningReference r2 = new ReassigningReference("Object 2");
r1 = r2;
r2 = null;
System.gc();
}
}