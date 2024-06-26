package assignment9;

import java.util.Arrays;
import java.util.List;
public class q5 {
public static void main(String[] args) {
List<String> strings = Arrays.asList("apple", "banana", "cherry", "blueberry", "grapefruit");
strings.stream()
.map(String::toUpperCase)
.filter(s -> !startsWithVowel(s))
.forEach(System.out::println);
}
private static boolean startsWithVowel(String s) {
return "AEIOU".indexOf(s.charAt(0)) != -1;
}
}