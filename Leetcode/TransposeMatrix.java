package solve_problems.Leetcode;

public class TransposeMatrix {

    public static void main(String[] args) {
        TransposeMatrix tm = new TransposeMatrix();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = tm.transposematrix(matrix);

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] transposematrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}
