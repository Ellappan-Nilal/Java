package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 * @author Nilal
 */
public class Strong_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int org=num;
        long s=0;
        while(num>0){
            int r=num%10;
            long fact=1;
            for(int i=1;i<=r;i++){
                fact*=i;
            }
            s+=fact;
            num/=10;
        }
        System.out.print(s);
        if(org==s){
            System.out.print(" Strong number");
        }
        else{
            System.out.print(" Not a strong number");
        }
    }
}
