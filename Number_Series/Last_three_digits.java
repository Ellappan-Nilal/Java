
package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 *last three digit sum
 */
public class Last_three_digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n%10+n/10%10+n/100%10);
    }
}
