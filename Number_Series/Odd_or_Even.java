package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 * @author Nilal
 */
public class Odd_or_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x=sc.nextInt();
        if(x%2==0){
            System.out.print("Even number");
        }else{
            System.out.print("Odd number");
        }
    }
}
