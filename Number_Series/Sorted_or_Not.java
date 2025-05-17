
package solve_problems.Number_Series;

import java.util.Scanner;

public class Sorted_or_Not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1<=n2&&n2<=n3){
            System.out.print("Sorted");
        }else if(n1>=n2&&n2>=n3){
            System.out.print("Sorted");
        }else{
            System.out.print("Not Sorted");
        }
    }
            
}
