public class patternsearch {

    public static int countPattern(String text, String pattern) {
        int count = 0;
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == m)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "XYZABCYZZABCZZXYZBC";
        String pattern = "ABC";
        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        int totalCount = countPattern(text, pattern);
        System.out.println("Total occurrences of the pattern: " + totalCount);
    }
}
