package assignment9;

import java.util.function.Function;

public class q6 {
    public static Function<Integer, Integer> getSquareFunction() {
        return x -> x * x;
    }
    
    public static void main(String[] args) {
        Function<Integer, Integer> square  = getSquareFunction();
        int number = 5;
        int sq = square.apply(number);
        System.out.println("The square of " + number + " is " + sq);
        System.out.println(square.apply(4));
    }
}
