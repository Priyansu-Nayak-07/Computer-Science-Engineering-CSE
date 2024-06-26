public class Q9
 {
    public static void main(String[] args) {
        int num = 12321; // example number
        boolean isPalindrome = isPalindrome(num);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    private static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int original = num;
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
}
