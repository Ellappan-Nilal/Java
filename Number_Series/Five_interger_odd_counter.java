package solve_problems.Number_Series;
import java.util.Scanner;
public class Five_interger_odd_counter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int oddcount=0;
        for(int i=0;i<5;i++){
            int num=sc.nextInt();
            if(num%2!=0){
                oddcount++;
            }
        }
        System.out.print(oddcount);
    }
}
