
import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public static void main(String[] args) {
        int num = 123321; // example number
        int[] frequency = new int[10];
        while (num != 0) {
            int digit = num % 10;
            frequency[digit]++;
            num /= 10;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}

