package solve_problems.Number_Series;
import java.util.Scanner;
public class Characters_position_times {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<=4;i++){
            for(int ctr=1;ctr<=i+1;ctr++){
                System.out.print(str.charAt(i));
            }
        }
    }
}
