package solve_problems.Number_Series;
import java.util.Scanner;
public class Check_if_multipes_of_N1_and_N2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num2%num1==0 && num3%num2==0){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
