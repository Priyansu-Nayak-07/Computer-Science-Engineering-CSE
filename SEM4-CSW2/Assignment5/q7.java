package assignment5;
public class q7 {

    public static void main(String[] args) {
        String inputString = "hello world";
        char searchChar = 'o';
        char[] charArray = inputString.toCharArray();
        int firstOccurrence = inputString.indexOf(searchChar);
        int lastOccurrence = inputString.lastIndexOf(searchChar);
       
      
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + searchChar + "' at position: " + firstOccurrence);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
        if (lastOccurrence != -1) {
            System.out.println("Last occurrence of '" + searchChar + "' at position: " + lastOccurrence);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
    }
}

