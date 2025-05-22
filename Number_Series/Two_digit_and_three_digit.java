package solve_problems.Number_Series;
import java.util.Scanner;
public class Two_digit_and_three_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if((n1>9 && n1<100)&&(n2>99 && n2<999)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
