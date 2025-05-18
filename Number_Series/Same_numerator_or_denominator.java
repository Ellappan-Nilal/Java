package solve_problems.Number_Series;

import java.util.Scanner;

public class Same_numerator_or_denominator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int numerator1,denominator1,numerator2,denominator2;
        String[] fraction=str1.split("/");
        numerator1=Integer.parseInt(fraction[0]);
        denominator1=Integer.parseInt(fraction[1]);
        fraction=str2.split("/");
        numerator2=Integer.parseInt(fraction[0]);
        denominator2=Integer.parseInt(fraction[1]);
        if(numerator1==numerator2 || denominator1==denominator2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
