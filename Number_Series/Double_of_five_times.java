package solve_problems.Number_Series;
import java.util.Scanner;
public class Double_of_five_times {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ctr=5;
        while(ctr>0){
            n=n+n;
            ctr--;
        }
        System.out.println(n);
    }
}
