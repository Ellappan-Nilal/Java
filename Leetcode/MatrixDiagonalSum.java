
public class MatrixDiagonalSum {
    public static void main(String[] args){
        MatrixDiagonalSum obj = new MatrixDiagonalSum();

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = obj.diagonalsum(mat);
        System.out.println("Diagonal Sum: " + result);
    }
    public int diagonalsum(int[][] mat){
        int len=mat.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=mat[i][i];
            sum+=mat[len-1-i][i];
        }
        if(len%2!=0){
            sum-=mat[len/2][len/2];
        }
        return sum;
    }
}
