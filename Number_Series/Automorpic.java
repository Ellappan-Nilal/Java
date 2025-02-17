package solve_problems.Number_Series;

import java.util.Scanner;

public class Automorpic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int temp=x;
        boolean b=true;
        int sq=x*x;
        while(x>0){
            if(sq%10!=x%10){
                b=false;
                break;
            }
            sq/=10;
            x/=10;
            
        }
        if(b){
            System.out.print("Automorpic ");
        }else{
            System.out.print("Not Automorpic ");
        }
    }
}
