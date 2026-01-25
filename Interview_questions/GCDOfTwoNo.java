package solve_problems.Interview_questions;
import java.util.Scanner;
public class GCDOfTwoNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print(gcd(n1,n2));
        
    }
    public static int gcd(int a,int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;
       
        if (a == b)
            return a;
       
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
        
    }
}
