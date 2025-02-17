
package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 * @author Nilal
 */
public class Factorial_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print("The factorial"+n+"is"+fact);
    }
}
