
package solve_problems.Interview_questions;

import java.util.Scanner;

public class LCMOfTwoNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
         int lcm=(n1>n2)?n1:n2;
         while(true){
             if(lcm%n1==0&&lcm%n2==0){
                 System.out.print("LCM of no"+lcm);
                 break;
             }
             lcm++;
         }
    }
}
