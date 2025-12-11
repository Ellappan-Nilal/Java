
package solve_problems.Leetcode;

public class TransposeMatrix {
    public static void main(String[] args){
        
    }
    public int[][] transposematrix(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix.length;
        int transpose[][]=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
}
