import java.util.*;
public class sum_of_diagonal_without_mid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int diagonalsum=0;
        for(int i=0;i<n;i++){
           diagonalsum+=mat[i][i];
           if(i!=n-i-1){
               diagonalsum+=mat[i][n-i-1];
           }
        }
        System.out.println(diagonalsum);
    }
}
