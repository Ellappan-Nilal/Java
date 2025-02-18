import java.util.Arrays;
import java.util.Scanner;

public class Minimum_element_in_row {

    public static int[] minInRowSimple(int[][] matrix) {
        int[] minElements = new int[matrix.length]; 

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0]; 
            for (int j = 1; j < matrix[i].length; j++) { 
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minElements[i] = min;
        }
        return minElements;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int[] result = minInRowSimple(matrix);
        System.out.println(Arrays.toString(result));
    }
}