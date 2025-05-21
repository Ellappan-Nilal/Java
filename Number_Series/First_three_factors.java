package solve_problems.Number_Series;
import java.util.Scanner;
public class First_three_factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factor=0,ctr=1;
        while(factor<3){
            if(n%ctr==0){
                System.out.print(ctr+" ");
                factor++;
            }
            ctr++;
        }
    }
}
