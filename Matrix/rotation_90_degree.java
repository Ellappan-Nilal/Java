import java.util.*;
public class rotation_90_degree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int nr=c,nc=r;
        int[][] trans=new int[nr][nc];
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                trans[i][j]=mat[j][i];
            }
        }
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc/2;j++){
                int temp=trans[i][j];
                trans[i][j]=trans[i][nc-1];
                trans[i][nc-1-j]=temp;
            }
        }
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}