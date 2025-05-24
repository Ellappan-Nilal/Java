package solve_problems.Number_Series;
import java.util.Scanner;
public class Positive_or_negative_based_multiples {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ctr,value;
        if(n>0){
            value=n%10;
            for(ctr=1;ctr<=5;ctr++){
                System.out.print(value*ctr+" ");
            }
        }else{
            value=(n%10)*-1;
            for(ctr=1;ctr<=10;ctr++){
                System.out.print(value*ctr+" ");
            }
        }
        
    }
}
