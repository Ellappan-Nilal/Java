package solve_problems.Number_Series;
import java.util.Scanner;
public class Greatestof_three_numbres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        
        if(x>y&&x>z){
            System.out.print(x);
        }else if(y>z){
            System.out.print(y);
        }else{
            System.out.print(z);
        }
    }
}
