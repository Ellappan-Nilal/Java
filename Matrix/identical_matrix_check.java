import java.util.Scanner;

public class identical_matrix_check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][rows1]; 

        // Read matrix 1
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < rows1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        int rows2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][rows2]; 

        // Read matrix 2
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < rows2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        boolean identical = true;

        if (rows1 != rows2) { 
            identical = false;
        } else {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < rows1; j++) {
                    if (matrix1[i][j] != matrix2[i][j]) {
                        identical = false;
                        break; 
                    }
                }
                if (!identical) {
                    break; 
                }
            }
        }


        if (identical) {
            System.out.println("Identical");
        } else {
            System.out.println("Not Identical");
        }
        sc.close();
    }
}
