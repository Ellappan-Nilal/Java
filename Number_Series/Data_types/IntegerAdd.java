
package solve_problems.Number_Series.Data_types;

import java.util.Scanner;

public class IntegerAdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1+n2==n3||n2+n3==n1||n1+n3==n2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
