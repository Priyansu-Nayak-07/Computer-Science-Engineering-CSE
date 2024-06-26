package assignment5;

public class q2{

    public static void main(String[] args) {
        // Demonstrate String immutability
        String originalString = "Hello";
        String modifiedString = originalString.concat(" World");

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        // Demonstrate usage of CharSequence interface
        CharSequence charSequence = "Java is fun!";
        System.out.println("Length of the CharSequence: " + charSequence.length());
        System.out.println("First character of the CharSequence: " + charSequence.charAt(0));
        System.out.println("Substring of the CharSequence: " + charSequence.subSequence(5, 7));
    }
}

