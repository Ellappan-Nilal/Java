package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 * @author Nilal
 */
public class Power_of_the_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        long ans=1;
        for(int i=0;i<pow;i++){
            ans*=num;
        }
        System.out.print(ans);
    }
}
