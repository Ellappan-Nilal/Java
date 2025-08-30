
package solve_problems.Number_Series;

import java.util.Scanner;

public class unit_digit_assending_and_desending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int unidix=x%10;
        int unidiy=y%10;
        if(unidix==unidiy){
            if(x>y){
                System.out.print(x+" "+y);
            }else{
                System.out.print(y+" "+x);
            }
        }
        else if(unidix < unidiy){
          System.out.print(y+" "+x);
        }
        else{
            System.out.print(y+" "+x);
        }
    }
}
