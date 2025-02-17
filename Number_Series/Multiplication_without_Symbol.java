package solve_problems.Number_Series;

import java.util.Scanner;

public class Multiplication_without_Symbol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<=a;i++){
            sum=sum+b;
        }
        System.out.print(sum);
    }
}
