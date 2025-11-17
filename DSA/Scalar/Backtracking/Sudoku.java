
package solve_problems.DSA.Scalar.Backtracking;

public class Sudoku {
    public static void main(String[] args){
        
    }
    public static void solvesudoku(char[] arr){
        if(sudokusolve(arr,0,0)){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
