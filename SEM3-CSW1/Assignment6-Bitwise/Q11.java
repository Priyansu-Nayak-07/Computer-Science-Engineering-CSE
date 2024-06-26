
public class Q11 {

    public static void main(String[] args) {
        int num = 123456; // example number
        int evenCount = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            }
            num /= 10;
        }
        System.out.println("Number of even digits: " + evenCount);
    }
}

