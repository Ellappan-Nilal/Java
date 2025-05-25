package solve_problems.Pattern;
import java.util.Scanner;
public class Two_integer_triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        for(int i=1;s<=e;i++){
            for(int j=s;j<=e;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            e--;
        }
    }
}
