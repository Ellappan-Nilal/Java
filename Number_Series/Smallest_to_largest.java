package solve_problems.Number_Series;
import java.util.Scanner;
public class Smallest_to_largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int minVal=Math.min(x, y);
        int maxVal=Math.max(x, y);
        while(minVal<=maxVal){
            System.out.print(minVal++ + " ");
        }
    }
}
