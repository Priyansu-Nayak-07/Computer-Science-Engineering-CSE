public class Q6 {
    public static void main(String[] args) {
        int x = 15;
        int y = 3;
        int result = 0;
        
        while (x >= y) {
            int tempY = y;
            int multiple = 1;
            
            while (x >= (tempY << 1)) {
                tempY <<= 1;
                multiple <<= 1;
            }
            x -= tempY;
            result += multiple;
        }
        System.out.println("Result of division: " + result);
    }
}
