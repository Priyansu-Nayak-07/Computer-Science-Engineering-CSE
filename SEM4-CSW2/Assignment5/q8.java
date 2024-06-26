package assignment5;
public class q8 {

    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "World";
        String concatenatedWithStringMethod = firstString.concat(secondString);
        String concatenatedWithPlusOperator = firstString + secondString;
        System.out.println("Concatenated with String method: " + concatenatedWithStringMethod);
        System.out.println("Concatenated with + operator: " + concatenatedWithPlusOperator);
        int index = 3;
        if (index >= 0 && index < concatenatedWithStringMethod.length()) {
            // Retrieve and display the character at the specified index
            char charAtIndex = concatenatedWithStringMethod.charAt(index);
            System.out.println("Character at index " + index + ": " + charAtIndex);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}
