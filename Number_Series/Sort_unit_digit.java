package solve_problems.Number_Series;
import java.util.Scanner;
public class Sort_unit_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x%10==y%10){
            System.out.print((x<y?x:y)+" "+(x>y?x:y)+" "+z);
        }else if(y%10==z%10){
            System.out.print((y<z?x:z)+" "+(y>z?y:z)+" "+x);
        }else if(x%10==z%10){
            System.out.print((x<z?x:z)+" "+(x>z?x:z)+" "+y);
        }
    }
}
