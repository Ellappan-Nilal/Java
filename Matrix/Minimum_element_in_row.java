import java.util.Scanner;

public class Minimum_element_in_row {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt(); 

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0]; 
            for (int j = 1; j < cols; j++) { 
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            System.out.print(min + " ");
        }
        System.out.println(); 
        sc.close();
    }
}