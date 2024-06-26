

public class Q8 {
    public static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int input = 123; // Change this value to test different numbers
        int reversed = reverse(input);
        System.out.println("Original number: " + input);
        System.out.println("Reversed number: " + reversed);
    }
}
