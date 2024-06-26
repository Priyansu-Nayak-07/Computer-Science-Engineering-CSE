import java.util.*;
class Q3 { 
    // method to find factorial of given number 
    static int factorial(int n) 
    { 
        if (n == 0) 
            return 1; 
  
        return n * factorial(n - 1); 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
    	Scanner sc= new  Scanner(System.in);
    			System.out.println("Enter the number");
        int num =sc.nextInt(); 
        System.out.println("Factorial of " + num 
                           + " is " + factorial(num)); 
    } 
} 