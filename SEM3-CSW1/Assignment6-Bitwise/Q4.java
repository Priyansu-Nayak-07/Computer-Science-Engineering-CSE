public class Q4 {
    public static long reverseBits(long number) {
        long reversed = 0;
        for (int i = 0; i < 64; i++) {
           
            reversed = (reversed << 1) | (number & 1);
            
            number >>= 1;
        }
        return reversed;
    }

    public static void main(String[] args) {
        long input = 0b1010101010101010L;
        System.out.println("Input:  " + Long.toBinaryString(input));
        long reversed = reverseBits(input);
        System.out.println("Output: " + Long.toBinaryString(reversed));
    }
}
