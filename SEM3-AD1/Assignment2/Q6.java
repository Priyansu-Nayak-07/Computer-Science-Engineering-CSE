import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter a decimal number");
        int decimalNumber = sc.nextInt(); // Replace this with your decimal number

        String hexadecimal = convertToHexadecimal(decimalNumber);

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexadecimal);
        sc.close();
    }

    public static String convertToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        int remainder = decimal % 16;
        char hexChar;
        
        if (remainder < 10) {
            hexChar = (char) ('0' + remainder);
        } else {
            hexChar = (char) ('A' + (remainder - 10));
        }
        
        // Recursively convert the quotient
        return convertToHexadecimal(decimal / 16) + hexChar;
    }
}
