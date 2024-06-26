package assignment9;

import java.util.function.Function;

public class q7 {

    public static void main(String[] args) {
        Function<Integer, Integer> factorial = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
            	if (n == 0) {
            		return 1;
            		} else {
            		return n * this.apply(n - 1);
            		}
            }
        };
        int number = 5;
        System.out.println("The factorial of " + number + " is " + factorial.apply(number));
    }
}
