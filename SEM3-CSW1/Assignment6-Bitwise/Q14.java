public class Q14 {
    public static void main(String[] args) {
        int num = 29; // example number
        boolean isPrime = isPrime(num);
        System.out.println("Is prime: " + isPrime);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
