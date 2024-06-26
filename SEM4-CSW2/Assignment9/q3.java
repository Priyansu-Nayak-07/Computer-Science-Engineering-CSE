package assignment9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class q3 {
public static void main(String[] args) {
Stream<Integer> primeNumbers = generatePrimeNumbers();
List<Integer> primes = new ArrayList<>();
primeNumbers.limit(10).forEach(primes::add);
System.out.println(primes);
}
private static Stream<Integer> generatePrimeNumbers() {
return Stream.iterate(2, n -> n + 1)
.filter(q3::isPrime);
}
private static boolean isPrime(int num) {
if (num < 2) {
return false;
}
for (int i = 2; i * i <= num; i++) {
if (num % i == 0) {
return false;
}
}
return true;
}
}