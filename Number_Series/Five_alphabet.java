package solve_problems.Number_Series;
import java.util.Scanner;
public class Five_alphabet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        for(int i=1;i<=5;i++){
            System.out.print(c);
            c++;
        }
    }
}
