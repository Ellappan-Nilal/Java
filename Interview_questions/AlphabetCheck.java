package solve_problems.Interview_questions;
import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
           System.out.print(ch+" is Alpabet character");
        }else{
            System.out.print(ch+" is Not Alpabet character ");
        }
    }
}
