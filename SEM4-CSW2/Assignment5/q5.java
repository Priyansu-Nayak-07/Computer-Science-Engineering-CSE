 package assignment5;
public class q5 {
    public static void main(String[] args) {
        String baseString = "Hello";
        int numConcatenations = 10000;
        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numConcatenations; i++) {
            stringBuilder.append(baseString);
        }
        String resultBuilder = stringBuilder.toString();
        long endTimeBuilder = System.currentTimeMillis();
        long timeTakenBuilder = endTimeBuilder - startTimeBuilder;
        
        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        String resultBuffer = stringBuffer.toString();
        long endTimeBuffer = System.currentTimeMillis();
        long timeTakenBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Using StringBuilder...");
        System.out.println("Time taken: " + timeTakenBuilder + " milliseconds");
        System.out.println("Final string length: " + resultBuilder.length());

        System.out.println("\nUsing StringBuffer...");
        System.out.println("Time taken: " + timeTakenBuffer + " milliseconds");
        System.out.println("Final string length: " + resultBuffer.length());

        // Comparison
        if (timeTakenBuilder < timeTakenBuffer) {
            System.out.println("\nComparison: StringBuilder was faster than StringBuffer by " + (timeTakenBuffer - timeTakenBuilder) + " milliseconds");
        } else if (timeTakenBuffer < timeTakenBuilder) {
            System.out.println("\nComparison: StringBuffer was faster than StringBuilder by " + (timeTakenBuilder - timeTakenBuffer) + " milliseconds");
        } else {
            System.out.println("\nComparison: Both StringBuilder and StringBuffer took the same amount of time.");
        }
    }
}

