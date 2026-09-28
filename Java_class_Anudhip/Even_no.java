package solve_problems.Java_class_Anudhip;
import java.util.Scanner;
public class Even_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=50;        
        int i=2;
        while(i<=n){
            if(n%2==0){                
                System.out.println(i);                
            }
            i++;
        }
    }
}
