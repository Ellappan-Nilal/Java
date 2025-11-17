
package solve_problems.DSA.Scalar.Backtracking;

public class Sudoku {
    public static void main(String[] args){
        
    }
    public static void solvesudoku(char[][] arr){
        if(sudokusolve(arr,0,0)){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void sudokusolve(char[][] arr,int x,int y){
        int nx=y==8?x+1:x;
        int ny=y==8?0:y+1;
        if(arr[i][j]=='.'){
        for(int val=1;val<=9;val++){
            if(canweplace(arr,x,y,val)==true){
                arr[x][y]=(char)(val+'0');
                if(sudokusolve(arr,nx,ny)==true)
                    return true;
            }
            arr[x][y]=(char)(val+'0');
        }
    }else{
            if(sudokusolver(arr,nx,ny)==true){
                return true;
            }
        }
    }
}
