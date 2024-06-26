package assignment5;
public class q9 {
    public static void main(String[] args) {
        String sentence = "This is sample sentence";
        String searchWord = "sample";
        String replaceWord = "example";

        // Find the first occurrence of the search word in the sentence
        int startIndex = sentence.indexOf(searchWord);
        int endIndex = startIndex + searchWord.length();

        // Replace the word using substring operations and concatenation
        String modifiedSentence = sentence.substring(0, startIndex) + replaceWord + sentence.substring(endIndex);

        // Display the original and the modified sentences
        System.out.println("Original sentence: " + sentence);
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}

