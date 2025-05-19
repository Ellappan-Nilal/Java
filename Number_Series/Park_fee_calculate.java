package solve_problems.Number_Series;
import java.util.Scanner;
public class Park_fee_calculate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int am1=sc.nextInt();
        int am2=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int total=((am1*n1)+(am2*n2));
        System.out.print(total);
    }
}
