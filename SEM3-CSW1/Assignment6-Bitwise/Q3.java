public class Q3 {
    public static void main(String[] args) {
        int num = 29; // example number
        int i = 1;
        int j = 3;
        int bit_i = (num >> i) & 1;
        int bit_j = (num >> j) & 1;

        if (bit_i != bit_j) {
            num ^= (1 << i) | (1 << j);
        }
        System.out.println("Number after swapping bits: " + num);
    }
}
