public class Q2 {
    public static void main(String[] args) {
        int num = 29; // example number
        int count = Integer.bitCount(num);
        int parity = count % 2;
        System.out.println("Parity: " + parity);
    }
}
