
package solve_problems.Number_Series;
import java.util.Scanner;
public class Absolute_Difference_Multiples {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();        
        int diff=n1-n2;
       
        for(int i=1;i<=10;i++){
            System.out.print(i*diff+" ");
        }
                
        
    }
}
