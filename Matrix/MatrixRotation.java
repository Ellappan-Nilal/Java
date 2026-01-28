/*Given two matrices a and b both of size NxN find if matrix a can be transformed to
matrix b by rotating it 90deg , 180deg , 270deg if so print TRUE else print FALSE*/
import java.util.Arrays;
import java.util.Scanner;
public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input1 = sc.nextLine().split(" ");
        int n = (int) Math.sqrt(input1.length); // Assuming square matrix
        int[][] a = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(input1[k++]);
            }
        }
        String[] input2 = sc.nextLine().split(" ");
        int[][] b = new int[n][n];
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = Integer.parseInt(input2[k++]);
            }
        }
        if (areEqual(a, b) || areEqual(rotate90(a), b) || areEqual(rotate180(a), b) || areEqual(rotate270(a), b)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        sc.close();
    }

    // Helper functions

    static int[][] rotate90(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    static int[][] rotate180(int[][] matrix) {
        return rotate90(rotate90(matrix));
    }

    static int[][] rotate270(int[][] matrix) {
        return rotate90(rotate90(rotate90(matrix)));
    }

    static boolean areEqual(int[][] a, int[][] b) {
        return Arrays.deepEquals(a, b);
    }
}






