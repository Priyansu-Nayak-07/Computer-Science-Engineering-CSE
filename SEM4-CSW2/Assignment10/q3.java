package assignment10;

 public class q3 {
public static void main(String[] args) {
int[][] matrixA = {
{1, 2, 3}, {4, 5, 6}, {7, 8, 9}
};
int[][] matrixB = {
{9, 8, 7}, {6, 5, 4}, {3, 2, 1}
};
int[][] result = multiplyMatrices(matrixA, matrixB);
System.out.println("Resultant Matrix:");

for (int i = 0; i < result.length; i++) {
for (int j = 0; j < result[0].length; j++) {
System.out.print(result[i][j] + " ");
}
System.out.println();
}
}
public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
int rowsA = matrixA.length;
int colsA = matrixA[0].length;
int colsB = matrixB[0].length;
int[][] result = new int[rowsA][colsB];
Thread[] threads = new Thread[rowsA];
for (int i = 0; i < rowsA; i++) {
final int row = i;
threads[i] = new Thread(() -> {
for (int j = 0; j < colsB; j++) {
for (int k = 0; k < colsA; k++) {
result[row][j] += matrixA[row][k] * matrixB[k][j];
}
}
});
threads[i].start();
}
try {
for (Thread thread : threads) {
thread.join();
}
} catch (InterruptedException e) {
e.printStackTrace();
}
return result;
}
}