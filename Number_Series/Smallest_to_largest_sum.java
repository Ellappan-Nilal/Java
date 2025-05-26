package solve_problems.Number_Series;
import java.util.Scanner;
public class Smallest_to_largest_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println(Math.min(Math.min(n1, n2),n3)+Math.max(Math.max(n1,n2), n3));
    }
}
