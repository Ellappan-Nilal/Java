
package solve_problems.Pattern.Number;

import java.util.Scanner;

/**
    2 
   4 6 
  8 10 12 
 14 16 18 20 
22 24 26 28 30 
 */
public class Evennumber_pramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=2;
        for(int i=1;i<=n;++i){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
    }
}