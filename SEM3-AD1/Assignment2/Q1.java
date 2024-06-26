import java.util.*;
public class Q1
{ 
    public static int recurSum(int n) 
    { 
        if (n <= 1) 
            return n; 
        return n + recurSum(n - 1); 
    } 
      
    public static void main(String args[]) 
    { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number");
        int n =sc.nextInt(); 
        System.out.println(recurSum(n)); 
    } 
} 
  
