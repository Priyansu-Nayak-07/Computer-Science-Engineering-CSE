package assignment3;
// Generic class q1 with type parameters K and V
public class q1<K, V> {
    // Private fields to hold key and value
    private K key;
    private V value;

    // Constructor to initialize key and value
    public q1(K key, V value) {
        this.key = key;
        this.value = value;
    }
    // Getter method for key
    public K getKey() {
        return key;
    }
    // Setter method for key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter method for value
    public V getValue() {
        return value;
    }

    // Setter method for value
    public void setValue(V value) {
        this.value = value;
    }

    // Main method to test the q1 class
    public static void main(String[] args) {
        // Creating an instance of q1 with String key and Integer value
        q1<String, Integer> pair = new q1<>("hello", 107);
        // Printing the key and value
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}
