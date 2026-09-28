package solve_problems.Java_class_Anudhip;
import java.util.Scanner;
public class Largest_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println("N1 is large");
        }else if(n2>n3){
            System.out.println("N2 is large");
        }else{
            System.out.println("N3 is large");
        }
    }
}
